import java.util.Scanner;

public class InstrukcjeWarunkowe {

    public static void main(String[] args){

        // INSTRUKCJA IF
        int a = 18;
           if(a<10){
            System.out.println("a jest mniejsze od 10");
        }
           else if(a==10){
               System.out.println("a = 10");
           }
           else if(a==9){
               System.out.println("a = 9");
           }
           else {
               System.out.println("a > 10");
           }

           // INSTRUKCJA ZAGNIEŻDŻONA
           int b = 20;
           if(b<25){
               System.out.println("B jest mniejsze od 25");
               if(b!=25){
                   System.out.println("B nie jest równe 25");
               }
               else {
                   System.out.println("B jest równe 25");
               }
           }

           // INSTRUKCJA SWITCH
        int c = 4;
           switch (c)
           {
               case 1:
                   System.out.println("c=1");
                   break;
               case 19:
                   System.out.println("c=19");
                   break;
                   default:
                       System.out.println("c nie jest równe ani 1 ani 19");
           }

           int d = 10;
           int e;
           e = d < 10 ? -1 : 1; // Jeżeli c jest mniejsze od 10 to przypisz jej wartość -1, w przeciwnym wypadku przypisz jej wartość 1
                System.out.println(e);



                //BREAK

        for(int i=0; i<10; i++){
            System.out.print(" " + i + " ");
            if(i==5){
                break;
            }
        }


        // CONTINUE
        for(int j=0; j<10; j++){
            if(j%2==0) { // jeżeli j = 2 to nic nie wypisuj i zacznij pętle od nowa
                continue;
            }
            System.out.println(j + " ");
        }

        // POBIERANIE SŁÓW WPISANYCH PRZEZ UĆYTKOWNIKA
        Scanner scanner = new Scanner(System.in); // pobieranie słów wpisanych przez użytkownika
        String name;
        name = scanner.next();
        System.out.println(name);

        // POBIERANIE CYFR WPISANYCH PRZEZ UŻYTKOWNIKA
        Scanner scannerCyfr = new Scanner(System.in);
        

    }
}
