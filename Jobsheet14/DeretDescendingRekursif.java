import java.util.Scanner;
public class DeretDescendingRekursif{
    static void deretDescendingRekursif(int n){
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.print("Deret descending Rekursif: ");
        deretDescendingIteratif(n);
        System.out.println();

        System.out.print("Deret descending iteratif: ");
        deretDescendingIteratif(n);
        System.out.println();

        sc.close();
    }
}