import java.util.Scanner;
public class UTSDaspro4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalHarga = 0.0;

        String[] fruits = {"Mangga", "Apel", "Anggur"};
        double[] hargaPerPound = {5.00, 3.00, 2.00};

        System.out.println("Fruits Menu");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i] + " - $" + hargaPerPound[i] + " per pound");
        }
        System.out.println((fruits.length + 1) + ". Keluar");

        while (true) {
            System.out.print("Masukkan pilihanmu (1/2/3/4): ");
            int pilihan = input.nextInt();

            if (pilihan == fruits.length + 1) {
                break; 
            } else if (pilihan < 1 || pilihan > fruits.length) {
                System.out.println("Pilihan tidak cocok. Masukkan pilihan yang benar");
                continue;
            }

            int indeksTerpilih = pilihan - 1;
            String fruitName = fruits[indeksTerpilih];
            double hargaPerPoundTerpilih = hargaPerPound[indeksTerpilih];

            System.out.print("Masukkan berat dalam pounds: ");
            double weight = input.nextDouble();

            double hargaItem = hargaPerPoundTerpilih * weight;
            totalHarga += hargaItem;

            System.out.println("Harga dari " + fruitName + " (" + weight + " pounds) adalah: $" + hargaItem);
        }

        System.out.println("Total yang harus dibayar: $" + totalHarga);
        System.out.println("Terima kasih telah membeli!");
        input.close();
    }
}
