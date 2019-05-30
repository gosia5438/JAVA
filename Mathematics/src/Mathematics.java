public class Mathematics {
    public static void main (String[] args){

        Mathematics m = new Mathematics();
        m.className();  // wywołanie metody
        System.out.println(m.sqrt(5));

    }
    public void className(){  //tworzymy metodę

        System.out.println("Mathematics");

    } // void czyli nie zwraca zadnej wartosci - tworzymy metode

    public int sqrt(int a){  // tworymy metodę ktora zwraca nam int o nazwie sqrt
    return  a*a;

    }
    public double sqrt(double a){ //metoda przyjmujaca parametr typu double
        return a*a;
    }
}
