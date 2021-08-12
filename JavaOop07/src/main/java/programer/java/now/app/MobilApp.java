package programer.java.now.app;

import programer.java.now.data.Avansa;
import programer.java.now.data.Mobil;

public class MobilApp {
    public static void main(String[] args) {
        
        //objek menggunakan polymorphism 
        Mobil mobil = new Avansa();
        mobil.jenisKendaraan();
        System.out.println("Rodanya ada "+ mobil.getRoda());
    }
}
