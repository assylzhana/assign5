package task1;

public class Main {
    public static void main(String[] args) {
        CharacterCreator characterCreator = new CharacterCreator();
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = characterCreator.createCharacter("Aragorn", warriorFactory);
        Character mage = characterCreator.createCharacter("Gandalf", mageFactory);
        Character archer = characterCreator.createCharacter("Legolas", archerFactory);
        printCharacterDetails(warrior);
        printCharacterDetails(mage);
        printCharacterDetails(archer);
    }

    private static void printCharacterDetails(Character character) {
        System.out.println("Character Name: " + character.getName());
        System.out.println("Appearance: " + character.getAppearance().getAppearanceName());
        System.out.println("Abilities:");
        for (Ability ability : character.getAbilities()) {
            System.out.println("- " + ability.getAbilityName());
        }
        System.out.println("Equipment:");
        for (Equipment equipment : character.getEquipment()) {
            System.out.println("- " + equipment.getEquipmentName());
        }
        Attribute attributes = character.getAttributes();
        System.out.println("Attributes - Health: " + attributes.getHealth() + ", Mana: " + attributes.getMana() + ", Strength: " + attributes.getStrength() + ", Agility: " + attributes.getAgility());
        System.out.println();
    }
}
