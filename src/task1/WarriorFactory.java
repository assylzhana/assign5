package task1;

import java.util.ArrayList;
import java.util.List;

class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        List<Ability> warriorAbilities = new ArrayList<>();
        warriorAbilities.add(new Ability("Sword Strike"));
        warriorAbilities.add(new Ability("Shield Bash"));

        List<Equipment> warriorEquipment = new ArrayList<>();
        warriorEquipment.add(new Equipment("Sword"));
        warriorEquipment.add(new Equipment("Shield"));

        Attribute warriorAttributes = new Attribute(100, 20, 10, 5);

        return new Character(name, new Appearance("Warrior"), warriorAbilities, warriorEquipment, warriorAttributes);
    }
}