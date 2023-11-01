import java.util.Scanner;

public class LatMan_JenisMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] mahasiswa = new String[30];
        int count = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jenisKelamin = input.nextLine().trim().toLowerCase();

            if (jenisKelamin.equals("p")) {
                mahasiswa[count] = nama;
                count++;
            }
        }

        System.out.println("\nNama-nama mahasiswa perempuan:");
        for (int i = 0; i < count; i++) {
            System.out.println(mahasiswa[i]);
        }

        input.close();
    }
}

