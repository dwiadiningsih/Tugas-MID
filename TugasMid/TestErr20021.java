/* Nama : Dwi Adiningsih
   Nim : 13020210021 */

public class TestErr20021 {
    public static void main(String[] args) { 
        int toti = 0; 
        int i, j;
        for (i = 0; i < 10; i++) {
            System.out.print(i + " "); 
        }
        System.out.println();
        i = 5;
        j = 7;
        if (i < j) { 
            System.out.println("i kurang dari j");
        } else {
            do {
                j++;
            } while (j < 10);
        }
    }
}