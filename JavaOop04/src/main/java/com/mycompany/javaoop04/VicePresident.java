package com.mycompany.javaoop04;

public class VicePresident extends Manager{
    
    /*
    Source code dibawah ini merupakan sebuah turunan dari kelas manager
    pengertian dari keyword super (name) yaitu memanggil ulang atau set ulang
    constructor yang manager sehingga dalam kelas turunan tidak diperlukan inisialisasi
    kembali perlu diperhatikan class employee, manager, vicepresident saling berkaitan atau
    pewarisan
    */
    
    VicePresident(String name) {
        super(name);
    }
    void getName(String name){
        System.out.println("Hi, "+ name +"My name is VicePresident "+ this.name);
    }
    
    
}
