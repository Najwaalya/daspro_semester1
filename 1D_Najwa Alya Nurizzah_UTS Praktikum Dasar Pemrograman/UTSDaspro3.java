import java.util.Scanner;
public class UTSDaspro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bobotPotensiAkademik = 0.5, bobotBahasaInggris = 0.3, bobotNilaiWawancara = 0.2;
        double nilaiAkhir;
        int jumlahMhs;

        System.out.print("Masukkan jumlah mahasiswa yang mengikuti seleksi masuk perguruan tinggi: ");
        jumlahMhs = sc.nextInt();

        for (int i = 1; i <= jumlahMhs; i++) {
            System.out.println("Masukkan nilai calon mahasiswa ke-" + i + " :");

            System.out.print("Masukkan nilai Tes Potensi Akademik (0-100)\t: ");
            double nilaiPotensiAkademik = sc.nextDouble();

            System.out.print("Masukkan nilai Tes Bahasa Inggris (0-100)\t: ");
            double nilaiBahasaInggris = sc.nextDouble();

            System.out.print("Masukkan nilai Tes Wawancara (0-100)\t\t: ");
            double nilaiWawancara = sc.nextDouble();

            nilaiAkhir = (nilaiPotensiAkademik * bobotPotensiAkademik) + (nilaiBahasaInggris * bobotBahasaInggris) + (nilaiWawancara * bobotNilaiWawancara);
    
            System.out.println("Nilai Akhir: " + nilaiAkhir);

            double rata2 = nilaiBahasaInggris + nilaiPotensiAkademik + nilaiWawancara/3; 
            System.out.println("Nilai rata-rata anda: " + rata2);
        
            if (nilaiBahasaInggris >= 70 && nilaiWawancara > 80) {
                System.out.println("Selamat! Anda diterima di jurusan Sistem Informasi");
            } else if ((nilaiBahasaInggris > 70 && nilaiPotensiAkademik > 70 && nilaiWawancara > 70) || (nilaiBahasaInggris == 100 || nilaiPotensiAkademik == 100 || nilaiWawancara == 100)) {
                System.out.println("Selamat! Anda diterima di jurusan Ilmu Komputer");
            } else if ((rata2 > 75) || (nilaiBahasaInggris >= 50)) {
                System.out.println("Selamat! Anda diterima di jurusan Bisnis Manajemen");
            } else if ((nilaiBahasaInggris > 60 && nilaiPotensiAkademik > 60 && nilaiWawancara > 60) || (nilaiPotensiAkademik == 100 || nilaiBahasaInggris == 100 )){
                System.out.println("Selamat! Anda diterima di jurusan Teknik Informatika");
            }
        }

        sc.close();
    }
}