package chapter9;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake() {
        System.out.println("Default constructor Birthday Cake!");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
