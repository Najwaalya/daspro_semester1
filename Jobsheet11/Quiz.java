import java.util.Scanner;
import java.util.Random;
public class Quiz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Lebih besar! Coba lagi. ");
                } else if (answer > number) {
                    System.out.println("Lebih kecil! Coba lagi. ");
                } else {
                    success = true;
                    System.out.println("Selamat! Anda berhasil menebak angka");
                }
                
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (y/Y)?");
            menu = input.nextLine().charAt(0);

            if (menu != 'y' && menu != 'Y') {
                break;
            }
        } while (menu == 'y' || menu == 'Y');

        input.close();
    }
}