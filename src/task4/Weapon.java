package task4;

class Weapon {
    private String type;
    private int damage;
    private int speed;
    private int range;

    public Weapon(String type, int damage, int speed, int range) {
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }
}
