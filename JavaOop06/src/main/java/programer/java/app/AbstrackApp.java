package programer.java.app;

import programer.java.data.Animal;
import programer.java.data.Cat;

public class AbstrackApp {
    public static void main(String[] args) {
        
        //objek dibawah ini menggunakan polymorphism
        //polymorphism khusus digunakan untuk class turunanan seperti ini
        Animal animal = new Cat();
        animal.name = "Agusti";
        animal.run();
    }
    
}
