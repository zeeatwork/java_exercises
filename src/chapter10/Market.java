package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple fiji = new Apple();
        Banana plantain = new Banana();
        Fruit yellow = new Banana();
        Fruit grannySmith = new Apple();

        System.out.println("The Granny smith apple's calories " + grannySmith.getCalories() + " yum yum ");
        grannySmith.makeJuice();
        yellow.makeJuice();
        plantain.peel();
        fiji.makeJuice();
    }
}
