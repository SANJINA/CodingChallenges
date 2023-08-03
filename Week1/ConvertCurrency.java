package assignment1.Day2;

public class ConvertCurrency {
    public static void main(String[] args) {
        int usdValue = 10;
        final float conversionRate = 74.72f;

        double rupees = conversionRate * usdValue;
        System.out.println("USD value " + usdValue + " = " + rupees + " Rupees");


    }
}
