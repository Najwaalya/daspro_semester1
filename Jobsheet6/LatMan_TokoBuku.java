import java.util.Scanner;
public class LatMan_TokoBuku {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine().toLowerCase();
        
        System.out.print("Jumlah buku yang dibeli: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0.0;

        if (jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else if (jumlahBuku > 3) {
            diskon = 0.05;
        }

        double totalDiskon = diskon * 100; // Mengubah diskon menjadi persen

        System.out.println("Total diskon yang diberikan: " + (totalDiskon * 100) + "%");

        input.close();
    }
}
