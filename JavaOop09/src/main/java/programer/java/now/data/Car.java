package programer.java.now.data;


public class Car {
    
    public String name;
    public String hoby;
    
    public Car(String name, String hoby){
        this.name = name;
        this.hoby = hoby;
    }
    
    /*
    Dalam sourcecode dibawah ini merupakan sebuah keyword to string 
    yang mana digunakan untuk memunculkan sebuah objek contructor
    yang mana langsung dibuat dalam class induk
    */
    public String toString(){
        return "Hi my name is"+ name +"My hoby"+ hoby;
    }
}
