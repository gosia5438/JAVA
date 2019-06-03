package TemperatureConverter;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Give in the Celsius value: ");
        Scanner getValue = new Scanner(System.in);
        double celsius = getValue.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.println("Fahrenheit: " +  fahrenheit);


        System.out.println("Give value in Fahrenheit: ");
        Scanner fValue = new Scanner(System.in);
        double fahrenValue = fValue.nextDouble();
        double celsValue = (fahrenValue - 32.0) * 5.0 / 9.0;
        if (celsValue >= 100) {
            System.out.println("Water has " + celsValue + " water is boiling");
        } else if (celsValue <=0){
            System.out.println("Water has " + celsValue + " water is freezing");
        }
        else {
            System.out.println("Water has " + celsValue + " water is NOT boiling and NOT frizing");
        }

    }
}
