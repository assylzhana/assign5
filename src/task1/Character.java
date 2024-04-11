package task1;


import java.util.List;

class Character {
    private String name;
    private Appearance appearance;
    private List<Ability> abilities;
    private List<Equipment> equipment;
    private Attribute attributes;

    public Character(){}

    public Character(String name, Appearance appearance, List<Ability> abilities, List<Equipment> equipment, Attribute attributes) {
        this.name = name;
        this.appearance = appearance;
        this.abilities = abilities;
        this.equipment = equipment;
        this.attributes = attributes;
    }



    public String getName() {
        return name;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public Attribute getAttributes() {
        return attributes;
    }
}