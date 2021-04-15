public abstract class Mammal extends Animal {
    protected String skinType;

    public Mammal(String name, int numberOfLegs, String skinType) {
        super(name, numberOfLegs);
        this.skinType = skinType;
    }

    public String getSkinType() {
        return skinType;
    }
}
