import java.util.Scanner;
public class TugasAkhir09{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jmlelemen, total = 0;
        double rata2; 

        System.out.print("Masukkan banyaknya bilangan : ");
        jmlelemen = sc.nextInt();
        int [] array = new int [jmlelemen];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai elemen ke- " + (i+1) + ": ");
            array[i] = sc.nextInt();
            total += array[i];
        }

        int nilaiTertinggi = array[0], nilaiTerendah = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
        }

        rata2 = total / jmlelemen;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rata2);

        sc.close();
    }
}
    