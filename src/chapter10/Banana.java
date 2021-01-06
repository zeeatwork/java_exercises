package chapter10;

public class Banana extends Fruit {
    private boolean isRipe;

    public Banana() {
        setCalories(100);
    }

    public void peel(){
        System.out.println("I have peeled my banana.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Made a delicious banana smoothie");
    }
}
