package ShapesPrint;

import java.util.Scanner;

public class ShapePrint {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j<= i; j++){
                System.out.print(j);
            }
            for (int k = 6; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Row: ");
        int rows = sc.nextInt();
        System.out.println("Columns: ");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0 ){
            System.out.println("Error ! ");
        } else {
            for (int i = 1; i<= rows; i ++){
                for (int j = 1; j <= rows; j++){
                    System.out.print("B");
                }
                System.out.println();
            }
        }


        System.out.println();
        System.out.println();
        int i =2, small = 0, large = 0;
        System.out.println("Num 1: ");
        int a = sc.nextInt();
        small = a;
        large = a;

        while (i<= 10){
            System.out.println("Num " + i + " : ");
            int b = sc.nextInt();
            if ( b <  small){
                small = b;
            }
            if (b > large){
                large = b;
            }
            i++;
        }
        System.out.println(" Large: " + large + " Small: " + small);






}







        }






