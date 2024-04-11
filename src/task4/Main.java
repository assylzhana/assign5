package task4;

public class Main {
    public static void main(String[] args) {
        CharacterCreator characterCreator = new CharacterCreator();
        characterCreator.setFactory(new WarriorSwordFactory());
        Character warrior = characterCreator.createCharacter();
        characterCreator.setFactory(new MageStaffFactory());
        Character mage = characterCreator.createCharacter();
        characterCreator.setFactory(new ArcherBowFactory());
        Character archer = characterCreator.createCharacter();
        displayCharacterDetails(warrior);
        displayCharacterDetails(mage);
        displayCharacterDetails(archer);
    }

    private static void displayCharacterDetails(Character character) {
        System.out.println("Character Name: " + character.getName());
        System.out.println("Character Class: " + character.getCharacterClass());
        System.out.println("Weapon Type: " + character.getWeapon().getType());
        System.out.println("Health: " + character.getHealth());
        System.out.println("Mana: " + character.getMana());
        System.out.println();
    }
}