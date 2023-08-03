package assignment.Day7;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {

        //take input array of temperature
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int arrayLength = scan.nextInt();

        //declare array
        float[] temperatureArray = new float[arrayLength];

        //initialize array
        System.out.println("Enter temperatures: ");
        for(int i = 0; i < arrayLength; i++){
            temperatureArray[i] = scan.nextFloat();
        }
        scan.close();
        System.out.println("Array: " + java.util.Arrays.toString(temperatureArray));

        float maxTemp = findMaxTemperature (temperatureArray);
        float minTemp = findMinTemperature (temperatureArray);
        float avgTemp = findAvgTemperature (temperatureArray);

        System.out.println("Max: " + maxTemp + " Min: " + minTemp +  " Average: " + avgTemp);
    }

    public static float findMaxTemperature (float[] array){
        float currentMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > currentMax){ currentMax = array[i];}
        }
        return currentMax;
    }

    public static float findMinTemperature (float[] array){
        float currentMin = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < currentMin){ currentMin = array[i];}
        }
        return currentMin;
    }

    public static float findAvgTemperature (float[] array){
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        float avg = sum / array.length;
        return avg;
    }
}
