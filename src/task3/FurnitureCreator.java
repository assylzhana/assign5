package task3;

class FurnitureCreator {
    private FurnitureFactory factory;

    public void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    public Chair createChair() {
        return factory.createChair();
    }

    public Table createTable() {
        return factory.createTable();
    }

    public Sofa createSofa() {
        return factory.createSofa();
    }
}