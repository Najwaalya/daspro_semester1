import java.util.Scanner; 
public class HargaBayar20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String merkbuku, jmlHalBuku;
        int harga, jumlah;
        double dis, total, bayar, jmlDis;
        System.out.print("Merk Buku: ");
        String inputText = input.nextLine();  
        System.out.print("Jumlah Halaman Buku: ");
        String inputText2 = input.nextLine();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.print("Diskon yang didapatkan: ");
        dis = input.nextInt();
        System.out.println("Diskon yang didapatkan " +dis +"%");
        total = harga*jumlah;
        jmlDis = total*dis/100;
        bayar = total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+bayar);

    }
}