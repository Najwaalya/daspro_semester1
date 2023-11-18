import java.util.Scanner;
public class SegitigaAngka{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        int[][] segitiga = new int [N][N];

        for (int i = 0; i < N; i++) {
            int angka = 1;
            for (int j = N - 1 - i; j < N; j++) {
                segitiga[i][j] = angka;
                angka++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (segitiga[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(segitiga[i][j] + " ");
                }
            }
             System.out.println();
        }
        sc.close();
    }
    
}