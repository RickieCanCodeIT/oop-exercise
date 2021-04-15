public class Deer extends Mammal{
    protected double weight;

    public Deer(String name, int numberOfLegs, String skinType, double weight) {
        super(name, numberOfLegs, skinType);
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println(name + " runs from predators" );
    }

    @Override
    public void eat() {
        System.out.println(name + " eats grass, but still  weighs " + weight);
    }

    @Override
    public void look() {
        System.out.println(name + " looks around carefully");
    }

}
