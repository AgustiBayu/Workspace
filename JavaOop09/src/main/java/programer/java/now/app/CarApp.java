package programer.java.now.app;

import programer.java.now.data.Car;


public class CarApp {
    public static void main(String[] args) {
        
        Car xenia = new Car("Agusti Bayu Samudro", "Pencak Silat");
        System.out.println(xenia.name);
        System.out.println(xenia.hoby);
        
        /*
        ouput ini akan memanggil objek dari contructror xenia dengan 
        menggunakan method tostring yang berada dalam class data sehingga
        programer tidak perlu implemen kembali constructor nya
        */
        System.out.println(xenia);
        
    }
    
}
