package com.mycompany.javaoop03;


public class Lingkarang {
    
    String name;
    
    /*
    source code dibawah ini merupakan sebuah induk dari constructor yang mana
    akan diturunkan ke class turunanya 
    */
    Lingkarang(String name) {
        this.name = name;
    }
    
    void hellobayu(String name){
        System.out.println("Hi,"+name+ " namaku "+ this.name); 
    }
    
    int sisi(){
        return 0;
    }
}
