package com.mycompany.javaoop03;


public class Persegi extends Lingkarang {
    
    int sisi(){
        return 4;
    }
    /*
    dalam sourcode dibawah ini merupakan sebuah constraktor yang turunan
    dari constructor induk, untuk mengakses bisa dengan cara memanggil keyword
    super. 
    */
    Persegi(String name) {
       super(name);
    }
    
    
    /*
    fungsi method dibawah ini adalah memanggil method induknya
    dengan menggunakan kyeword super. nama method untuk getsisi 
    merupakan varibel baru yang dibuat karena method sisi dalam 
    induk sudah dirubah oleh class turunanya sehingga harus dideklarasikan
    kembali dengan keywor super agar tidak terjadi variable shadowing
    */
    int getSisi(){
        return super.sisi();
    }
}
