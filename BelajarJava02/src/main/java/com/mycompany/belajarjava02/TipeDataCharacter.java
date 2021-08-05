package com.mycompany.belajarjava02;


public class TipeDataCharacter {

   
    public static void main(String[] args) {
        
        /*
        untuk menampilkan sebuah nilai yang sudah kita inisialisasi 
        yaitu dengan menggunakan sebuah Syestem.out.println setelah itu
        variabelnya perhatikan println dengan print, println digunakan untuk
        menampilkan nilai setelah itu enter namun jika print saja maka setelah
        memunculkan data tidak ada enter
        */
        
        char a = 'A';
        char b = 'B';
        char c = 'C';
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        /*
        Tipe data dibawah ini merupakan tipedata boolean yang memiliki
        2 difault yaitu benar dan salah
        */
        
        boolean benar = true;
        boolean salah = false;
        
        System.out.println(benar);
        System.out.println(salah);
        
        /*
        Dalam Source code dibawah ini merupakan sebuah tipedata
        string dan varibel fristname dan lastname yang didalamnya
        sudah diberi sebuah huruf yang dikurung dengan menggunakan 
        tanda titik 2
        */
        
        String fristName = "Agusti";
        String lastName = "Bayu Samudro";
        String fullname = fristName+ " " +lastName;
        
        System.out.println(fristName);
        System.out.println(lastName);
        System.out.println(fristName+ " " +lastName);
        System.out.println(fullname);
                
    }
    
}
