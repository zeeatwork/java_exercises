package chapter13;

public class DivideByZero {
    public static void main(String[] args) {
        printDivisionStatement();
    }

    public static void printDivisionStatement(){
        try{
            int c = 30/0;
        } catch (ArithmeticException e){
            System.out.println("This is not an integer value");
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun!");
        }
    }
}
