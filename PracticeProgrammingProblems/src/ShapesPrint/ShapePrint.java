package ShapesPrint;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShapePrint {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Row: ");
        int rows = sc.nextInt();
        System.out.println("Columns: ");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Error ! ");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("B");
                }
                System.out.println();
            }
        }*/


 /*       System.out.println();
        System.out.println();
        int i = 2, small = 0, large = 0;
        System.out.println("Num 1: ");
        int a = sc.nextInt();
        small = a;
        large = a;

        while (i <= 10) {
            System.out.println("Num " + i + " : ");
            int b = sc.nextInt();
            if (b < small) {
                small = b;
            }
            if (b > large) {
                large = b;
            }
            i++;
        }
        System.out.println(" Large: " + large + " Small: " + small);*/


// potęgowanie
/*    Scanner sc = new Scanner(System.in);
        System.out.println("Give the base: ");
    int base = sc.nextInt();
        System.out.println("Give the expose: ");
        int expose = sc.nextInt();
        int result = 1, i =1;

        do {
            result = result * base;

            i++;
        } while (i <= expose);
        System.out.println(result);*/


// Pomnóż wszystkie liczby parzyste od 1 - 20, oraz dodaj wszystkie nieparzyste od 1 - 100
      /*  int odd = 1;
        int even = 0;
        int result = 0;
        for (int i = 1; i <= 20; i += 2) {
            odd = odd * i;
        }
        for (int i = 2; i <= 100; i += 2) {
            even = even + i;
        }
        System.out.println("Even: " + even + " Odd: " + odd);*/


        // Take an integer input from the user, print YES if it is prime number and NO if it
        //not a prime number. (Prime number is a number which is only divisible by 1 or
        //itself).

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Give the value: ");
        int userValue = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < userValue; i++){
            if (userValue % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
*/

      /*  Take two numbers from the user and print the result of multiplication and
        sum of all the numbers between these two numbers. E.g. if user presses 3 and 8
        then 4+5+6+7 is 22 and 4*5*6*7 is 840. (Restrict the user such that first
        number must be less than the second number).*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz pierwszą cyfrę : ");
        int a = sc.nextInt();
        System.out.println("Wpisz drugą cyfrę: ");
        int b = sc.nextInt();
        int sum = 0, mul = 1;
        if (b < a) {
            for (int i = a + 1; i < b; i++) {
                sum = sum + i;
                mul = mul * i;

                System.out.println(sum);
            }
            System.out.println("Suma dodawania jest rowna; " + sum + " Mnożenie: " + mul);
        } else {
            System.out.println("Druga cyfra nie może być większa od pierwszej");
        }*/


    }
}








