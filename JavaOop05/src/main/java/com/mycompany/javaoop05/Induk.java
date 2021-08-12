package com.mycompany.javaoop05;

class Induk {
    
    String name;
    
    void doIt(){
        System.out.println("Do it in Induk");
    }
}

class Turunan extends Induk{
    
    String name;
    
    void doIt(){
        System.out.println("Do it in Turunan");
        System.out.println("this is in parent "+ super.name);
    }
    
}
