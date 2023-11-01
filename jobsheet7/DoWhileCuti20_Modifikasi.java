import java.util.Scanner;
public class DoWhileCuti20_Modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Batas cuti: ");
        jatahCuti = input20.nextInt();

        do{
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input20.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input20.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                } //break;
            }
        } while (jatahCuti > 0);

        input20.close();
    } 
}