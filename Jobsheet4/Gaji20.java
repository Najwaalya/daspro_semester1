import java.util.Scanner;
public class Gaji20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji, Gaji, potGaji ;
        System.out.print("Masukkan Besaran Gaji ");
        Gaji = input.nextInt();
        System.out.print("Masukkan Potongan Gaji ");
        potGaji=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*Gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
}