package programer.java.now.app;
 
import programer.java.now.data.*;

public class StaticApp {
    public static void main(String[] args) {
        
        /*
        keyword memanggil static field/atribut dalam suatu class
        */
        System.out.println(StaticField.APPLICATION);
        System.out.println(StaticField.VERSION);
        
        //keyword memanggil static method dalam suatu class
        System.out.println(StaticMethod.sum(25, 25, 25, 25, 25, 25));
        
        //keyword memanggil static inner class dalam class country
        Country.City kota = new Country.City();
        kota.setName("Jakarta");
        System.out.println(kota.getName());
        
        //keyword memanggil static block dalam class aplication
        System.out.println(Application.PROCESSOR);
    }
}
