package task2;

class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        // Process text data
        System.out.println("Processing text data: " + data.getContent());
    }
}