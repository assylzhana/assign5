package task3;

class ModernWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Modern Wood Chair", 100);
    }

    @Override
    public Table createTable() {
        return new Table("Modern Wood Table", 200);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Modern Wood Sofa", 300);
    }
}