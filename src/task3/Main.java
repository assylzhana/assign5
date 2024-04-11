package task3;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator furnitureCreator = new FurnitureCreator();
        furnitureCreator.setFactory(new ModernWoodFactory());
        Chair modernWoodChair = furnitureCreator.createChair();
        Table modernWoodTable = furnitureCreator.createTable();
        Sofa modernWoodSofa = furnitureCreator.createSofa();
        System.out.println("Modern Wood Furniture:");
        System.out.println("Chair: " + modernWoodChair.getName() + ", Price: $" + modernWoodChair.getPrice());
        System.out.println("Table: " + modernWoodTable.getName() + ", Price: $" + modernWoodTable.getPrice());
        System.out.println("Sofa: " + modernWoodSofa.getName() + ", Price: $" + modernWoodSofa.getPrice());
    }
}