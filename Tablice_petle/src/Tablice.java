public class Tablice {
    public static void main(String[] args) {
        int tab[] = new int[5]; /*definicja zmiennej tab to nazwa ktora moze byc zmieniona
        int[] tab = nie jest bledem, tablice zaczynamy od 0*/
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 4;
        /*
        int[] tab = {6, 9, 2, 6, 4} - też jest poprawne
        * */

        //        1.  Wywołanie pojedynczego elementu:  System.out.println(tab[0]) wynik = 6;

       /* 2. PĘTLA FOR Wywołanie całej tablicy za pomocą pętli FOR:
            for (int i = 0; i < tab.length; i++) {
                System.out.println("Dla zmiennej i = " + i +", Element tablicy = " + tab[i]);
             }      */

       /* 3. PĘTLA WHILE
       int n = 10;
       while(n>=0){
           System.out.println("cokolwiek " + n);
           n--;
       }               */

       /*  4. PĘTLA DO WHILE - wykona się przynajmniej raz
        int n = 10;
        do{
            System.out.println("tekst");
            n++;
        }
        while (n<=15); {
            System.out.println("koniec");
        }
*/


       //  . SPECJALNA PĘTLE "FOR EACH" TYLKO DO UŻYTKU PRZY TABLICACH
        for(int i : tab) {
            System.out.println("Elementy tablicy = " + i);
        }



    }
}
