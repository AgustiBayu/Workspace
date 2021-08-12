package programer.java.app;

import programer.java.data.City;

public class LocationApp {
    public static void main(String[] args) {
        
        /*
        Obje dibawah ini bila dibuat akan eror karena class induk Location digunakan
        abstract sehingga yang dapat digunakan sebagai objek merupakan class turunanya
        adalah city perharikan 2 class yang berbeda city dan location
        */
        // Location lokasi = new Location(); ERRORR
        
        City kota = new City();
        kota.name = "Agusti Bayu Samudro";
        System.out.println(kota.name);
    }
    
}
