package task4;

class MageStaffFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        Weapon weapon = createWeapon();
        return new Character("Mage", "Staff", weapon, 80, 100);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Staff", 15, 15, 5);
    }
}