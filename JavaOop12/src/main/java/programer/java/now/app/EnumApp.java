package programer.java.now.app;

import programer.java.now.data.Customer;
import programer.java.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
            
        Customer customer = new Customer();
        customer.setName("Agusti Bayu");
        customer.setLevel(Level.STANDART);//cara memanggil ouput enum class
        
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println("");
        
        customer.setName("Reka Nanda");
        customer.setLevel(Level.VIP);//cara memanggil ouput enum class
                 
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println("");
        
        customer.setName("Citol");
        customer.setLevel(Level.PREMIUM);//cara memanggil ouput enum class
        
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println("");
    }
    
}
