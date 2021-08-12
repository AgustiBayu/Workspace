package com.mycompany.belajarjava04;


public class TipeDataBukanPrimitif {

    
    public static void main(String[] args) {
        
        /*
        Dalam Source code dibawah digunakan untuk mengisi
        nilai dengan menggunakan tipedata bukan primitif sehingga
        default menjadi null bukan 0
        */
        
        Integer iniInteger = 1000;
        Long iniLong = 1000000L;
        Byte iniByte = null;
        
        System.out.println(iniByte);
        System.out.println(iniLong);
        System.out.println(iniInteger);
        
        //Dibawah ini merupakan sebuah konversi dari tipedata
        //primitif menjadi tipedata bukan primitif
        
        short iniShort = 1725;
        System.out.println(iniShort);
        
        Short iniShort2 = iniShort;
        System.out.println(iniShort2);
        
        /*Source code dibawah ini digunakan untuk mengkonversi tipedata
        bukan primitif ke tipedata primitif dengan menggunakan keyword (.)
        kemudian tipedata primitifnya
        */
        int iniInteger2 = iniShort2.intValue();
        System.out.println(iniInteger2);
    }
    
}
