package assignment.Day8;

public class SwapNumbers {
    public static void main(String[] args) {
        int x =4, y = 7;
        int helpSwap = 0;

        helpSwap = x;
        x = y;
        y = helpSwap;

        System.out.println("x: " + x + " and y:" + y);
    }
}
