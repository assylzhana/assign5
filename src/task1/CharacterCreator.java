package task1;
class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter(String name, CharacterFactory factory) {
        return factory.createCharacter(name);
    }
}
