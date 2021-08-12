package programer.java.now.data;

import programer.java.now.anotation.Fancy;

@Fancy(name = "Car",tags = {"Application","Java"})
public class Car {
    
    private String name;
    private int harga;
    
    public Car(String name, int harga){
        this.name = name;
        this.harga = harga;
    }
    @Fancy(name = "car", tags = {"application","java"})
    public void getCar(){
        System.out.println("My name is: "+ name +" Harga mobil ku: "+harga);
    }
    
}
