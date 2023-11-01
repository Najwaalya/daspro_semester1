import java.util.Scanner;
public class ForKelipatan20_Modifikasi {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int Kelipatan, Jumlah = 0, Counter = 0, rataRata;
        
        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        Kelipatan = input20.nextInt();

        for(int i = 1; i <= 50; i++) {
            if (i % Kelipatan == 0) {
                Jumlah += i;
                Counter++;
                
            }   
        }
        rataRata = Jumlah / Counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Jumlah);
        System.out.printf("Rata-rata bilangan %d 8 dari kelipatan adalah %d\n", Kelipatan, rataRata);

        input20.close();
    }
}