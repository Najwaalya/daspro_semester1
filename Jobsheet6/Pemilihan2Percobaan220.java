import java.util.Scanner;
public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        float sudut_1, sudut_2, sudut_3, totalSudut;

        System.out.println("Masukkan Sudut 1: "); 
        sudut_1 = input20.nextFloat();
        System.out.println("Masukkan Sudut 2: ");
        sudut_2 = input20.nextFloat();
        System.out.println("Masukkan Sudut 3: ");
        sudut_3 = input20.nextFloat();

        totalSudut =  sudut_1 + sudut_2 + sudut_3;

        if (totalSudut == 180) {
            if ((sudut_1 == 90) || (sudut_2 == 90) || (sudut_3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");

        input20.close();
    }
}