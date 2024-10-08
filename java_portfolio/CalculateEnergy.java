/**
 * /Julie Sakai
 * Module 2 Programming Assignment
*/

import java.util.Scanner;

/**
 * This program will calculate the energy required to heat water from an initial temperature
 * to a final temperature. The user inputs water mass in kilograms, initial temperature,
 * and final temperature, and the program computes the energy in joules. 
 */


public class CalculateEnergy {
    public static void main(String[] args) {

        double initalTemperature;
        double finalTemperature;
        double waterweight;

        System.out.println("Enter the weight of water in kilograms: ");

        Scanner input = new Scanner(System.in);
        waterweight = input.nextDouble();

        System.out.println("Enter the initial temperature of water in Celsius: ");

        Scanner input1 = new Scanner(System.in);
        initalTemperature = input1.nextDouble();

        System.out.println("Enter the final temperature of the water in Celsius: ");

        Scanner input2 = new Scanner(System.in);
        finalTemperature = input2.nextDouble();

        double result;

        result = waterweight * (finalTemperature - initalTemperature) * 4184;

        System.out.println("The energy needed to heat water is " + result + " Joules");
    }
}
