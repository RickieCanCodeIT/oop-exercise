public abstract class Animal {
    protected String name;
    protected int numberOfLegs;

    public abstract void move();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(String name) {
        this.name = name;
        this.numberOfLegs = 4;
    }

    public void look() {
        System.out.println(name + " sees normally");
    }

    @Override
    public String toString() {
        return "The animal is a " + name + " and has " + numberOfLegs + " legs";
    }
}
