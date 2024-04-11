package task4;

class WarriorSwordFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        Weapon weapon = createWeapon();
        return new Character("Warrior", "Sword", weapon, 100, 50);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Sword", 20, 10, 2);
    }
}