package task3;

class IndustrialGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Industrial Glass Chair", 120);
    }

    @Override
    public Table createTable() {
        return new Table("Industrial Glass Table", 220);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Industrial Glass Sofa", 320);
    }
}