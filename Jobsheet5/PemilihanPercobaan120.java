import java.util.Scanner;
public class PemilihanPercobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input20.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Bilangan " + angka + " adalah bilangan " + hasil);
        
        input20.close();
    }
}