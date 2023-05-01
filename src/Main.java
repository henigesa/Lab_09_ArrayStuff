import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints;
        int i = 0;

        dataPoints = new int[100];

        System.out.println("The following array is a randomly generated array of 100 integers between 1 and 100") ;

        for(i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(i = 0; i < dataPoints.length; i++)
        {
            System.out.printf(dataPoints[i] + " | ");
        }
        int sum = 0;
        for(i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        System.out.println("\nThe sum of all of the values in the array is " + sum);
        System.out.println("The average of all of the values in the array is " + sum / dataPoints.length);

        String prompt = "Enter an integer between 1 and 100 to search the array";
        int userInt = SafeInput.getRangedInt(in, prompt, 1, 100);
        int count = 0;
        for(i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userInt)
            {
                count += 1;
            }
        }
        System.out.println("" + userInt + " occurs in the array " + count + " times.");
        prompt = "Enter an integer between 1 and 100 to search for in the array";
        userInt = SafeInput.getRangedInt(in, prompt, 1, 100);

        int position = 0;
        boolean found = false;
        for(i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userInt)
            {
                position = i;
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("[" + userInt + "] was found in position " + position + " inside the array.");
        }
        else
        {
            System.out.println("[" + userInt + "] is not in the array.");
        }

        int min = 100;
        int minPosition = 0;
        int max = 0;
        int maxPosition = 0;

        for(i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] >= max)
            {
                maxPosition = i;
                max = dataPoints[i];
            }
            if(dataPoints[i] <= min)
            {
                minPosition = i;
                min = dataPoints[i];
            }
        }
        System.out.println("The max is " + max + " in spot " + maxPosition + " in the array.");
        System.out.println("The min is " + min + " in spot " + minPosition + " in the array.");

    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        int avg = sum / values.length;
        return avg;
    }
}