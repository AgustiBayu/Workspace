package com.mycompany.belajarjava;


public class TipeDataNumber {

    
    public static void main(String[] args) {
        
        /*
        Tipe data number dibawah merupakan sebuah tipe data bilangan bulat
        pengertian dari underskor digunakan untuk mengelompokan suatu pecahan
        dan ketikan variabel melebihi kapasitas dari int harus dikonversi dengan (L)/
        LONG sehingga data akan terdeteksi dan apabila tidak dirubah maka varibel iniLong
        akan terdeteksi sebagai integer
        */
        
        byte iniByte = 127;
        short iniShort = 32000;
        int iniInteger = 1_000_000_000;
        long iniLong = 2_000_000_000_000L;
        
        /*
        Tipe data dibawah ini merupakan sebuah tipedata pecahan
        pengertian dari F dan D didalam deklarasi dibawah ini adalah
        untuk menginisialisasi bahwa tipedata merupakan float (F) dan 
        Double (D)
        */
      
        float iniFloat = 10.10F;
        double iniDouble = 10.200D;
        
        /*
        dalam variabel dibawah ini digunakan sebagai konversi dari bilangan bulat ke 
        dalam bentuk decimal, hexa, binery, pengertian dari 0x merupakan inisialisasi 
        dari bilangan pencahan menjadi hexadecimal dan di ikuti dengan datanya sedangkan
        0b digunakan sebagai ini sialisasi binery
        */
        
        int decimalInt = 20;
        int hexaInt = 0xBBBB;
        int binInt = 0b1111;
        
        /*
        Varibel dibawah ini digunakan untuk mengkonversi tipe data A ke tipe data
        B atau asc dari kecil ke besar sehingga tidak memerlukan konversi manual
        */
        
        byte iniByte2 = 100;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong2 = iniInt2;
        
        /*
        Pengertian dari konversi dibawah ini adalah bila kita
        ingin mengkomversi tipe data dari desc dari yang besar ke yang
        kecil kita harus konversi secara manual seperti dibawah ini namun
        bila isi dari nilai melebihi kapasitas dari tipedata maka akan terjadi
        set variabel atau varible overlow sehingga sangat perlu ketelitian
        */
        
        long iniLong3 = 2_000_000_000_000;
        int iniInt3 = (int) ini iniLong3;
        
        
        
        
  
    }
    
}
