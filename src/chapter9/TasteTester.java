package chapter9;

public class TasteTester {
    public static void main(String[] args){
        Cake officeSweets = new Cake();
        BirthdayCake sweet16 = new BirthdayCake();
        WeddingCake loveBirds = new WeddingCake();


        officeSweets.setFlavor("Vanilla Bean");
        officeSweets.setPrice(29.99);

        sweet16.setCandles(16);
        sweet16.setFlavor("Lemon Pound");
        sweet16.setPrice(34.99);


        loveBirds.setTiers(6);
        loveBirds.setFlavor("Dark Chocolate");
        loveBirds.setPrice(427.50);

        System.out.println("The office party order is confirmed. Your "
        + officeSweets.getFlavor() + " Cake order total is " + officeSweets.getPrice());

        System.out.println("The birthday party order is confirmed. Your "
                + sweet16.getFlavor() + " Cake order total is " + sweet16.getPrice());

        System.out.println("The wedding party order is confirmed. Your "
                + loveBirds.getFlavor() + " Cake order total is " + loveBirds.getPrice());
    }




}
