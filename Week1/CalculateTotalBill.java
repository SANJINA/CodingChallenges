package assignment1.Day2;

public class CalculateTotalBill {
    public static void main(String[] args) {
        int amount = 30;
        int taxes = 15;
        int tip = 10;

        int totalBill = amount + taxes + tip;
        System.out.println("Total Bill amount = " + totalBill);
    }
}
