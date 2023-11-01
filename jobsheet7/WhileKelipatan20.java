import java.util.Scanner;
public class WhileKelipatan20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int Kelipatan, Jumlah = 0, Counter = 0, rataRata, i = 1;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        Kelipatan = input20.nextInt();

        while (i <= 50) {
            if (i % Kelipatan == 0) {
                Jumlah += i;
                Counter++;
            }
            i++;
        }
        rataRata = (Jumlah / Counter);
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, rataRata);

        input20.close();
    }
}