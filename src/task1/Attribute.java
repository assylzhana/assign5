package task1;


class Attribute {
    private int health;
    private int mana;
    private int strength;
    private int agility;

    public Attribute(int health, int mana, int strength, int agility) {
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }
}
