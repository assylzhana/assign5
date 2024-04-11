package task4;

class ArcherBowFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        Weapon weapon = createWeapon();
        return new Character("Archer", "Bow", weapon, 90, 70);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Bow", 18, 12, 8);
    }
}