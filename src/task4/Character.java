package task4;

class Character {
    private String name;
    private String characterClass;
    private Weapon weapon;
    private int health;
    private int mana;

    public Character(String name, String characterClass, Weapon weapon, int health, int mana) {
        this.name = name;
        this.characterClass = characterClass;
        this.weapon = weapon;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }
}
