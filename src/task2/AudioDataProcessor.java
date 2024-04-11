package task2;

class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing audio data: " + data.getContent());
    }
}