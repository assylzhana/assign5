package task3;

class Furniture {
    private String name;
    private String style;
    private String material;
    private float price;

    public Furniture(String name, String style, String material, float price) {
        this.name = name;
        this.style = style;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }
}