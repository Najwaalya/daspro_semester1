import java.util.Scanner;
public class UcapanTerimaKasih_20{
    public static String PenerimaUcapan(){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
   }

   public static void UcapanTambahan(String tambahan) {
    System.out.println(tambahan);
   }

   public static void UcapanTerimaKasih(){
   String nama = PenerimaUcapan();
   String ucapan = "Your dedication and passion for teaching have made a lasting impact on my life.";
   System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
   "You inspired in me a love for learning and made me feel like I could ask you anything.");

   UcapanTambahan(ucapan);
   }

   public static void main(String[] args) {
    UcapanTerimaKasih();
   }
}
