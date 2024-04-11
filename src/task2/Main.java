package task2;

public class Main {
    public static void main(String[] args) {
        DataProcessorCreator processorCreator = new DataProcessorCreator();
        DataProcessor textProcessor = new TextDataProcessor();
        DataProcessor audioProcessor = new AudioDataProcessor();
        DataProcessor videoProcessor = new VideoDataProcessor();
        processorCreator.setProcessor(textProcessor);
        processorCreator.processData(new Data("text", "This is a text message"));
        processorCreator.setProcessor(audioProcessor);
        processorCreator.processData(new Data("audio", "Audio data"));
        processorCreator.setProcessor(videoProcessor);
        processorCreator.processData(new Data("video", "Video data"));
    }
}