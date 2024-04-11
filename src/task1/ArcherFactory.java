package task1;

import java.util.ArrayList;
import java.util.List;

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        List<Ability> archerAbilities = new ArrayList<>();
        archerAbilities.add(new Ability("Arrow Shot"));
        archerAbilities.add(new Ability("Rapid Fire"));

        List<Equipment> archerEquipment = new ArrayList<>();
        archerEquipment.add(new Equipment("Bow"));
        archerEquipment.add(new Equipment("Quiver"));

        Attribute archerAttributes = new Attribute(90, 25, 8, 10);

        return new Character(name, new Appearance("Archer"), archerAbilities, archerEquipment, archerAttributes);
    }
}