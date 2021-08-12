package com.mycompany.javaoop02;

/*
Dalam class sepeda2 ini merupakan sebuah class turunan
dari class sepeda atau inheretrun perhatikan keyword extends
keyword itu digunakan untuk menghubungkan kelas induk dengan class
turunan 
*/
public class Sepeda2 extends Sepeda{
    
    void sepedaMu(){
        System.out.println("Terimakasih Untuk Semuanya");
    }
    /*
    method dibawah ini merupakan sebuah method overriding yang mana
    method sepedaku dalam induk diakses kembali dengan class turunan
    namun berbeda kondisi ouput 
    */
      void sepedaKu(String name){
        System.out.println("Hallo "+ name+" Salam Kenal");
    }
}
