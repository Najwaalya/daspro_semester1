import java.util.Scanner;
public class WhileGaji20 {
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
            i++;

            if(jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur:" + totalGajiLembur);
            
        }
         
        input20.close();
    }
}