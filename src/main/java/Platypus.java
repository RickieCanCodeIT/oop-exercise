public class Platypus extends Mammal implements LaysEggs{
    public Platypus(String name, int numberOfLegs, String skinType) {
        super(name, numberOfLegs, skinType);
    }

    @Override
    public void move() {
        System.out.println(name + " swims");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats something");
    }

    @Override
    public void layEgg() {
        System.out.println(name + " lays a really big egg, for a mammal");
    }

    @Override
    public String toString() {
        return "The platypus is a " + name + " and has " + skinType;
    }
}
