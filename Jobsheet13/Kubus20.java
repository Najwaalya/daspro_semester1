import java.util.Scanner;
public class Kubus20 {
    static int hitungVolume(int s){
        int Volume = s*s*s;
        return Volume;
    }
    static int hitungLuasPermukaan(int s){
       int volume= hitungVolume(s);
       int Luas= volume*6;
       return Luas;
    }
    public static void main(String[] args) {
    Scanner Input11= new Scanner(System.in);
    int sisi, L,V;
    System.out.print("Masukkan Panjang sisi kubus: ");

    sisi=Input11.nextInt();
    V = hitungVolume(sisi);
    System.out.println("Volume kubus : " +V);
    
    L= hitungLuasPermukaan(sisi);
    System.out.println("Luas Permukaan kubus : " +L);
    }
}