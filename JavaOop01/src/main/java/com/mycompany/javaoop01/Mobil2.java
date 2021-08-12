package com.mycompany.javaoop01;

public class Mobil2 {
    
    String pemilik;
    String pegawai;
    
    /*
    nama constructor harus sama dengan penamaan class dan varible
    method constructor bertujuan untuk mempermudah programer
    */
    Mobil2(String paramPemilik, String paramPegawai){
        pemilik = paramPemilik;
        pegawai = paramPegawai;
    }
    
    /*
    Tidak hanya method constructor juga bisa dibuat overloading atau
    dapat digunakan lebih dari satu kali tetapi harus memenuhi syarat
    yaitu parameter atau isi harus dibedakan. 2 source code dibawah ini
    merupakan constructor oveloading
    */
    Mobil2(String paramPemilik) {
        //keyword this ini diguanakan untuk meng set ulang constructor diatasnya
        //sehingga tidak perlu untuk menginisialisasi lagi constructor seperti 
        //diatas
        this("Maria Ozawa", null);
    }
    
    Mobil2(){
        //sama seperti penjelasa di atas keyword this ini digunakan untuk mengset
        //ulang constructor namun coba perhatikan constructor ini tidak mempunya
        //sebuah parameter sehingga default nya this null dan untuk outputnya
        // dilakukan secara manual di fungsi utama yaitu main class
        this(null);
    }
    
    
}
