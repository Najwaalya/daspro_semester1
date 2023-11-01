import java.util.Scanner;
public class Pemilihan2Percobaan120_Modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input20.nextInt();

        if ((tahun % 4 == 0)) {
            if ((tahun % 100) != 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun " + tahun + " adalah tahun kabisat");
                } else 
                    System.out.println("Tahun " + tahun + " adalah tahun kabisat");
            } else {
                System.out.println("Tahun " + tahun + " adalah tahun kabisat");
            }
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        }
        input20.close();
    }
}
