package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RealTimeDataProcessor {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/five";
    private static final String USER = "postgres";
    private static final String PASSWORD = "asylka225";

    public static void main(String[] args) {
        DataProcessorCreator creator = new DataProcessorCreator();
        creator.setProcessor(new TextDataProcessor());
        Data textData = new Data("text", "This is some text data");
        creator.processData(textData);
        Object audioContent = new byte[]{};
        Object videoContent = new byte[]{};

        creator.setProcessor(new AudioDataProcessor());
        Data audioData = new Data("audio", audioContent);
        creator.processData(audioData);

        creator.setProcessor(new VideoDataProcessor());
        Data videoData = new Data("video", videoContent);
        creator.processData(videoData);

        storeDataInDatabase(textData);
        storeDataInDatabase(audioData);
        storeDataInDatabase(videoData);
    }

    private static void storeDataInDatabase(Data data) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String sql = "INSERT INTO data_table (type, content) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, data.getType());
            pstmt.setObject(2, data.getContent());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
