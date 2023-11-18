import java.util.Scanner;
public class UTSDaspro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bobotPotensiAkademik = 0.5, bobotBahasaInggris = 0.3, bobotNilaiWawancara = 0.2;
        double nilaiAkhir;

        System.out.print("Masukkan nilai Tes Potensi Akademik (0-100): ");
        double nilaiPotensiAkademik = sc.nextDouble();

        System.out.print("Masukkan nilai Tes Bahasa Inggris (0-100): ");
        double nilaiBahasaInggris = sc.nextDouble();

        System.out.print("Masukkan nilai Tes Wawancara (0-100): ");
        double nilaiWawamcara = sc.nextDouble();

        nilaiAkhir = (nilaiPotensiAkademik * bobotPotensiAkademik) + (nilaiBahasaInggris * bobotBahasaInggris) + (nilaiWawamcara * bobotNilaiWawancara);
    
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}