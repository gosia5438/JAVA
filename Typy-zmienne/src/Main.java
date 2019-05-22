public class Main {

        // TYPY ZMIENNYCH

        byte b = 127; // -128 do 127, 1 bajt
        short s = 32767; // -32768 do 32767, 2 bajty
        int i = -2147483648; // -2 147 483 648 do 2 147 483 647
        long l = 922337203685477587L; // liczbe long kończymy literą 'l - jak long'
        float f = -3.444444f; // - musi kończyć się na literką f 6-7 miejsc po przecinku = 4 bajty
        double d = 3.7776545455667; // nie trzeba kończyć literą, 15 miejsc po przecinku = 8 bajtów
        char c = 'a'; // zmienną może być tylko jedna literą, 16 bitów (2 bajty)
//    String string = "To może nam reprezentować dowolny tekst"; // String musi być zapisany z dużej litery


        public static void main(String[] args) {

            int wynik1, wynik2 = 7, wynik3, wynik4; //tworzenie zmiennych, mo0żna przypisać od razu do nich wartość
            int l1 = 56;
            int l2 = 16;

            wynik1 = l1+l2; // SUMA
            wynik2 = l1-l2;
            wynik3 = l1*l2;
            wynik4 = l1/l2;
            int wynik5 = l1%l2; // wynik reszty z dzielenia
            //INKREMENTACJA - zwiększenie liczby o 1 / ++x lub x++
            wynik5++;
            //DEKREMENTACJA - zmniejszenie liczby o 1 --x lub x--
            wynik1--;


            System.out.println("Wynik dodawania  = " + wynik1);
            System.out.println("Wynik odejmowania  = " + wynik2);
            System.out.println("Wynik mnożenia = " + wynik3);
            System.out.println("Wynik dzielenia = " + wynik4);
            System.out.println("Reszta z dzielenia = " + wynik5);
        }
   }
