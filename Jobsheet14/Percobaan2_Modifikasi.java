import java.util.Scanner;
public class Percobaan2_Modifikasi {
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            System.out.print(x + "x");
            int hasilPangkat = x*hitungPangkat(x, y-1);
            if (y==1){
                System.out.print("1");
            }          
            return hasilPangkat;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int bilangan, pangkat;

       System.out.print("Bilangan yang dihitung: ");
       bilangan = sc.nextInt();
       System.out.print("Pangkat: ");
       pangkat = sc.nextInt();

       System.out.print("Hasil perhitungan: ");
       int hasil = hitungPangkat(bilangan, pangkat);
       System.out.println(" = " +hasil);

       sc.close();
    }
    
}