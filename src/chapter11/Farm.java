package chapter11;

public class Farm {
    public static void main(String[] args) {

        Animal pig = new Pig();
        Animal mallard = new Duck();

        mallard.makeSound();
        pig.makeSound();

        mallard.eat();
        pig.eat();
    }
}
