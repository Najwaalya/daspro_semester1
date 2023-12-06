

public class nyoba {
    public static void UcapanTerimakasih() {
        System.out.println("Thankyou for being the best teacher in the world. \n"+
        "You inspired in me a love for learning and made me feel like i could  ask you anything.");   
    }
    public static void UcapanTambahan (String Ucapan) {
        System.out.println(Ucapan);
    }
    
    
    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terimakasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}