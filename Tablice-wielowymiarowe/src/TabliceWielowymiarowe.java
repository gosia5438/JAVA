public class TabliceWielowymiarowe {


    public static void main(String[] args) {

        // TABLICA DWUWYMIAROWA

        int table[][] = {{2, 3, 4}, {1, 2, 3}};
        for (int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.println("Tablica wielowymiarowa ma wyniki: " + table[i][j]);
            }
        }

        // TABLICA JEDNOWYMIAROWA

        int table2[] = {1, 8, 5};
        for (int i : table2) {
            System.out.println("Tablica jednowymiarowa ma wyniki: " + i);
        }
    }
}
