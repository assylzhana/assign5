package task1;

import java.util.ArrayList;
import java.util.List;

class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        List<Ability> mageAbilities = new ArrayList<>();
        mageAbilities.add(new Ability("Fireball"));
        mageAbilities.add(new Ability("Ice Shard"));

        List<Equipment> mageEquipment = new ArrayList<>();
        mageEquipment.add(new Equipment("Staff"));

        Attribute mageAttributes = new Attribute(80, 30, 5, 15);

        return new Character(name, new Appearance("Mage"), mageAbilities, mageEquipment, mageAttributes);
    }
}