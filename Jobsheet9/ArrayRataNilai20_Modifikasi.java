import java.util.Scanner;
public class ArrayRataNilai20_Modifikasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, rata2, totalLulus = 0, totalTidakLlulus = 0;
        double rataLulus, rataTidakLulus;
        int jmlLulus = 0, jmlTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int [] nilaiMhs = new int[5];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] =  sc.nextInt();

            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                totalTidakLlulus += nilaiMhs[i];
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        rata2 =  total/nilaiMhs.length;
        rataLulus = totalLulus / jmlLulus;
        rataTidakLulus = totalTidakLlulus / jmlTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus adalah " +jmlLulus);
        System.out.println("Jumlah mahasiswa ang tidak lulus adalah " +jmlTidakLulus);

        sc.close();
    }
}