package programer.java.now.app;


public class SystemApp {
    public static void main(String[] args) {
        
        // digunakan untuk menampilkan miliscond saat ini
        System.out.println(System.currentTimeMillis());
        // digunakan untuk menampilkan nanoscond saat ini
        System.out.println(System.nanoTime());
        
        // digunakan untuk menampilkan envilopment dalam OS
        System.out.println(System.getenv("dev"));
        // digunakan untuk menampilkan gerbegtcollection
        System.gc();
        
        System.exit(0);// digunakan untuk menghentikan project java
        System.out.println("Halllo Agusti");// contoh tidak dijalankan
        
    }
    
}
