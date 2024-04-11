package task3;

class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Traditional Metal Chair", 150);
    }

    @Override
    public Table createTable() {
        return new Table("Traditional Metal Table", 250);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Traditional Metal Sofa", 350);
    }
}