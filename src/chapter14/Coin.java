package chapter14;

public class Coin {
    private String side;
    private final String HEADS = "Heads";
    private final String TAILS = "Tails";


    public String flip(){
        short randomNumber = (short)(Math.random() * 10 + 1);
        if (randomNumber <= 5){
            side = TAILS;
        } else side = HEADS;
        return side;
    }
}
