package com.mycompany.javaoop04;

public class Manager extends Employee{
    
    /*
    Source code dibawah ini merupakan sebuah turunan dari kelas employee
    pengertian dari keyword super (name) yaitu memanggil ulang atau set ulang
    constructor yang induk sehingga dalam kelas turunan tidak usah inisialisasi
    kembali
    */
    
    Manager(String name){
        super(name);
    }
    void getName(String name){
        System.out.println("Hi, "+ name +"My name is Manager "+ this.name);
    }
}
