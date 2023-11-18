import java.util.Scanner;
public class SegitigaBintang{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan nilai N (Minimal 5):  ");
        int N = sc.nextInt();

        if(N < 5){
            System.out.println("Nilai N harus minimal 5. ");
            return;
        }
        int [][] segitiga = new int [N][N];

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}