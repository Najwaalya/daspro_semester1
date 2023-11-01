import java.util.Scanner;
public class PemilihanPercobaan220_modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Nilai uas \t:");
        float uas = input20.nextFloat();
        System.out.print("Nilai uts \t:");
        float uts = input20.nextFloat();
        System.out.print("Nilai kuis \t:");
        float kuis = input20.nextFloat();
        System.out.print("Nilai tugas \t:");
        float tugas = input20.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80) {
            System.out.println("Nilai akhir " + total + " adalah " + " A");
        }else if (total > 73) {
            System.out.println("Nilai akhir " + total + " adalah " + " B+");
        }else if (total > 65) {
            System.out.println("Nilai akhir " + total + " adalah " + " B");
        }else if (total > 60) {
            System.out.println("Nilai akhir " + total + " adalah " + " C+");
        }else if (total > 50) {
            System.out.println("Nilai akhir " + total + " adalah " + " C");
        }else if (total > 39) {
            System.out.println("Nilai akhir " + total + " adalah " + " D");
        }else if (total < 39) {
            System.out.println("Nilai akhir " + total + " adalah " + " E");
        }

        input20.close();
    }
}