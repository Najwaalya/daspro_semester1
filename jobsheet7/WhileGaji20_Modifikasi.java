import java.util.Scanner;
public class WhileGaji20_Modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input20.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan\n- Direktur\n- Manajer\n- Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input20.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input20.nextInt();

            if(jabatan.equalsIgnoreCase("direktur")) {
                i++;
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                i++;
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                i++;
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan tidak valid. Silahkan masukkan jabatan yang valid");
                continue;
            }

            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur:" + totalGajiLembur);
            
        }
       
        input20.close();
    }
}