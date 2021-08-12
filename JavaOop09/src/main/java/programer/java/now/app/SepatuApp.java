package programer.java.now.app;

import programer.java.now.data.Sepatu;

public class SepatuApp {
    public static void main(String[] args) {
        
        Sepatu sepatu = new Sepatu("Agusti Bayu Samudro", 200_000);
        System.out.println(sepatu.name);
        System.out.println(sepatu.price);
        System.out.println(sepatu);
        
        /*
        sourcecode dibawah ini digunakan untuk mengecek apakan object sesuai
        atau tidak dengan yang dideklarasi dalam class
        */

        Sepatu sepatu2 = new Sepatu("Agusti Bayu Samudro", 200_000);
        System.out.println(sepatu2.equals(sepatu2));
        System.out.println(sepatu.hashCode() == sepatu2.hashCode());
    }
    
}
