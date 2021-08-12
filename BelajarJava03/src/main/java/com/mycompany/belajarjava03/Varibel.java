package com.mycompany.belajarjava03;


public class Varibel {

  
    public static void main(String[] args) {
        
        /*
        Dalam mengisi data pada varibel kita bisa dapat
        mengisinya dengan menggunakan berbagai cara sesuai
        dengan progremernya contoh seperti dibawah ini
        */
        
        String name, pasangan;
        
        name = "Agusti Bayu Samudro";
        pasangan = "Reka";
        
        byte umur = 21;
        String address = "Indonesia";
        
        System.out.println(umur);
        System.out.println(name);
        System.out.println(address);
        System.out.println(pasangan);
        
        //mengubah isi dari varibel yang sudah ditentukan
        name = "Samson Betawi";
        System.out.println(name);
        
        /*
        Dalam source code dibawah ini terdapat sebuah keyword final
        dimana keyword ini digunakan untuk cost atau nilai yang tetap 
        tidak dapat dirubah sehingga jika konversi maka akan terjadi error
        dalam progam java
        */
        
        final float ipk = (float) 3.70;
        
        System.out.println(ipk);
        
        ipk = 3.20;
        System.out.println(ipk);
        
    }
    
}
