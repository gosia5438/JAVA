import java.util.Arrays;

/*public class task1table {
    public static void main(String[] args) {
        int [] table = new int [10];
        for(int i = 0; i<table.length; i++){
            if(i%2==1){
                table[i] = i;
            }
            else {
                table[i] = i + 1;
            }

        }
        System.out.println("Wartość tabeli wynosi: " + Arrays.toString(table));
    }
}*/

// METODY
public class task1table{
    public static void main(String[] args) {
    int [] xArray = {1,13,2,1,8,10, 9, 4, 3};

    printArray(xArray);
    printEvenArray(xArray);
    printEvenIndexArray(xArray);

    System.out.println("Suma wszystkich liczb parzystych w tabeli wynosi: " + sumOfEvents(xArray));
        System.out.println("Suma wszystkich liczb nieparzystych w tabeli wynosi " + sumOfOdds(xArray));
        System.out.println("Suma parzystych indeksów w tablicy wynosi " + sumOfEvenIndices(xArray));
        System.out.println("Suma elementów tablicy znajdujących się pod nieparzystym indeksem wynosi: " + sumOfOddInciesElements(xArray));

    }
    public static void printArray(int [] x){

        for(int i = 0; i < x.length; i++ ){

            System.out.print(x[i] + " ");

        }
        System.out.println();

    }
// wydrukuj wartości tabli gdzie s liczby parzyste
    public static  void printEvenArray(int [] x){
        for (int i =0; i<x.length; i++){
            if (x[i]%2==0){
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
    }

 // wydrukuj elementy tablicy gdzie indeks jest nieparzysty
 public static void printEvenIndexArray(int [] x){
        for (int i =0; i<x.length; i++){
            if(i%2 == 1){
                System.out.println("Wartość nieparzystego indeksu wynosi " + i + " ,a elementu jego tablicy " + x[i]);
            }
        }

 }

 // wydrukuj sumę liczb parzystych
    public static int sumOfEvents(int [] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++){

            if (x[i] % 2 ==0)
                sum = sum + x[i];
        }
        return sum;
    }

    //wydrukuj sumę liczb nieparzystych w tabeli
    public static int sumOfOdds (int [] x){
        int sum = 0;
        for (int i =0; i < x.length; i++){
            if (x[i] % 2 == 1){
                sum = sum + x[i];
            }
        } return sum;
    }

    // wydrukuj sumę parzystych indeksów tablicy 0 + 2 + 4 + 6
    public static int sumOfEvenIndices (int [] x){
        int sum = 0;
        for (int i =0; i < x.length; i++){
            if (i%2 == 0) {
                sum =  sum + i;
            }
        } return sum;
    }

    // wydrukuj sumę elementów znajdujących się pod nieparzystym indeksem

    public static int sumOfOddInciesElements(int [] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++ ){
            if ( i % 2 == 1){
                sum = sum + x[i];
            }
        } return sum;
    }



}








/*
public  class task1table {
    public static void main(String[] args) {

        double a = 50;
        double b = a*0.62137;

        int c = 300;
        double d = c * .00056818;

        double e = 30;
        double f = e * 9/5 +32;

        double g = 70;
        double h = (g -32) * 5/9;

        int width = 2;
        int length = 4;
        int perimeter = width *2 + length *2;

        System.out.println( a + " km wynosi  " + b + " mi ");
        System.out.println(c + " yardów wynosi  " + d + " mi ");
        System.out.println(e + " stopni C wynosi  " + f + " stopni F ");
        System.out.println(g + " stopni F wynosi  " + h + " stopni C ");
        System.out.println("Obwód wynosi  " + perimeter + " cm");
    }

}*/
