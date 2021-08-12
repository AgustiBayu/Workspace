package programer.java.now.app;

import programer.java.now.data.Car;
import programer.java.now.anotation.Fancy;

@Fancy(name = "car", tags = {"application","java"})
public class CarApp {
    
    @Fancy(name = "avansa", tags = {"aplication","java"})
    public static void main(String[] args) {
                
        Car avansa = new Car("Agusti Bayu Samudro", 2_000_00);
        avansa.getCar();
    }
    
}
