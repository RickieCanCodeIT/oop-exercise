public class AnimalApp {
    public static void main(String[] args) {
        Bird bird = new Bird("Bluejay", 2, "Tweet");
        bird.move();
        bird.eat();
        bird.look();
        bird.fly();
        bird.layEgg();
        Animal whiteDeer = new Deer("The White Doe", 4, "Hide", 150);
        whiteDeer.move();
        whiteDeer.eat();
        whiteDeer.look();
        System.out.println(whiteDeer);
        Platypus platy = new Platypus("Duckbill Platypus", 4, "Fur");
        platy.move();
        platy.eat();
        platy.layEgg();
        System.out.println(platy);

    }
}
