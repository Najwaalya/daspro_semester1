import java.util.Scanner;
public class Pemilihan2Percobaan220_Modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        float panjang_1, panjang_2, panjang_3;

        System.out.print("Masukkan Panjang 1: "); 
        panjang_1 = input20.nextFloat();
        System.out.print("Masukkan Panjang 2: ");
        panjang_2 = input20.nextFloat();
        System.out.print("Masukkan Panjang 3: ");
        panjang_3 = input20.nextFloat();


        if (panjang_1 == panjang_2 && panjang_2 == panjang_3) {
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
        }else if ((panjang_1 == panjang_2 || panjang_2 == panjang_3 || panjang_1 == panjang_3)) {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
        } else {
            System.out.println("Segitiga ini adalah segitiga sembarang");
        }

        input20.close();
    }
}