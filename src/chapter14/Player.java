package chapter14;

public class Player {
    private String name;
    private String guess;

    public Player(String name) {
        this.name = name;
    }


    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getName() {
        return name;
    }
}
