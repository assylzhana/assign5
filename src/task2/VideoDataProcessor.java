package task2;

class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing video data: " + data.getContent());
    }
}