package com.mycompany.javaoop03;


public class BangunApp {
    public static void main(String[] args) {
        
        Lingkarang bangun = new Lingkarang("Agusti Bayu Samudro");
        bangun.hellobayu("eko");
        System.out.println(bangun.sisi());
        System.out.println();
        
        
        Persegi bangun2 = new Persegi("Reka Nanda Putri");
        bangun2.hellobayu("Budi");
        System.out.println(bangun2.sisi());
        System.out.println(bangun2.getSisi());
    }
    
}
