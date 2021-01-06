package chapter10;

public class Apple extends Fruit {
    private String variety;

    public Apple() {
        setCalories(70);
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void core(){
        System.out.println("The apple has been cored.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made!");
    }
}
