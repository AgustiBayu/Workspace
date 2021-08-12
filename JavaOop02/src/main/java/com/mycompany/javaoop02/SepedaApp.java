package com.mycompany.javaoop02;


public class SepedaApp {
    public static void main(String[] args) {
        
        Sepeda poligon = new Sepeda();
        
        poligon.roda = "2";
        poligon.warna = "Biru";
        
        poligon.sepedaKu("Reka Nanda Putri");
        System.out.println("Sepedaku Roda "+ poligon.roda);
        System.out.println("Sepedaku Warnanya "+ poligon.warna);
        
        /*
        Dalam keyword dibawah ini merupakan class turunan dari class sepeda
        sehingga isi dalam method class sepeda akan diturunkan ke class turunan
        sehingga field atau method yang dimiliki class sepeda akan dimiliki juga
        dengan class sepeda2 
        */
        Sepeda2 bmx = new Sepeda2();
        
        bmx.roda = "3";
        bmx.warna = "Putih";
        
        System.out.println("Sepedaku Roda "+ bmx.roda);
        System.out.println("Sepedaku warnanya "+ bmx.warna);
        
        //source code method overriding 
        bmx.sepedaKu("Agusti Bayu Samudro");
        bmx.sepedaMu();
    }
    
}
