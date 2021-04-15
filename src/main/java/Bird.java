public class Bird extends Animal implements Flying, LaysEggs {

    private String sound;

    public Bird(String name, int numberOfLegs, String sound) {
        super(name, numberOfLegs);
        this.sound = sound;
    }

    @Override
    public void move() {
        System.out.println(name + " flies. It goes " + sound);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats a bug");
    }

    @Override
    public void roost() {
        System.out.println(name + " hangs out in their nest");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies");
    }

    @Override
    public void layEgg() {
        System.out.println(name + " lays an egg!");
    }
}
