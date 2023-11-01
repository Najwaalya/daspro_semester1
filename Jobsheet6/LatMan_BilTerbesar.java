public class LatMan_BilTerbesar {
        public static void main(String[] args) {
            int bil1 = 28;
            int bil2 = 54;
            int bil3 = 15;
            int terbesar = 0;
    
            if (bil1 > terbesar) {
                terbesar = bil1;
            }
    
            if (bil2 > terbesar) {
                terbesar = bil2;
            }
    
            if (bil3 > terbesar) {
                terbesar = bil3;
            }
    
            System.out.println("Bilangan terbesar: " + terbesar);
        }
}
