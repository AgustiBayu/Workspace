package com.mycompany.belajarjava11;


public class MethodJava02 {
    public static void main(String[] args) {
        
        helloWorld();
        helloWorld("Agusti");
        helloWorld("Agusti", "Bayu Samudro");
        System.out.println("");
        
        System.out.println(testFaktorial(5));
        System.out.println(5*4*3*2*1);//contoh perhitungan secara manual
        System.out.println("FaktorialRekursif");
        System.out.println(faktorialRekursif(5));
    }
    
    /*
    Dalam source code dibawah ini merupakan method ovel
    loading yang mana nama method dapat dipanggil secara 
    berulang namun dengan syarat parameter harus berbeda
    coba amati source code dibawah ini pada parameter aktualnya
    */
    
    static void helloWorld(){
        System.out.println("Hallo Bayu");
    }
    static void helloWorld(String name){
        System.out.println("Hello "+name);
    }
    static void helloWorld(String firstName, String lastName){
        System.out.println("Hello "+firstName+ " "+lastName);
    }
    
    /*
    Dalam source code dibawah ini merupakan sebuah progam faktorial
    yang mana faktorial ini merupakan rangs misal faktorial dari 5
    = 5*4*3*2*1 dengan source code dibawah ini adalah method
    dengan nilai balik atau non void
    */
    static int testFaktorial(int value){
        int data = 1;
        
        for(int nilai = 1; nilai <= value; nilai++){
            data *= nilai;
        }
        return data;
    }
    
    /*
    Source code dibawah ini merupakan sebuah vaktorial rekursif
    yang mana faktorial ini akan memanggil dirinya sendiri sehingga
    dapat mempermudah dalam beberapa kasus seperti faktorial yang 
    berada dalam contoh
    */
    static int faktorialRekursif(int value){
        
        if(value == 1){
            return 1;
        }
        else{
            return value * faktorialRekursif(value -1);
        }
    }
    
}

