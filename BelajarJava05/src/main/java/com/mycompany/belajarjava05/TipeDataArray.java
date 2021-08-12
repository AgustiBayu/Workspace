package com.mycompany.belajarjava05;

import java.util.Arrays;


public class TipeDataArray {

   
    public static void main(String[] args) {
        
        /*
        Dalam source code dibawah terdapat sebuah variable array 
        1 dimensi dengan menggunakan sebuah tipedata string 
        */
        
        String[] iniArray;
        iniArray = new String[3];
        
        //Atau
        String[] iniArray2 = new String[3];
        
        iniArray [0] = "Hallo";
        iniArray [1] = "Bayu";
        iniArray [2] = "ApaKabar";
        
        System.out.println(iniArray [2]);
        System.out.println(iniArray [1]);
        System.out.println(iniArray [0]);
        
        /*
        Atau juga dapat membuat array seperti dibawah ini
        tergantung programer dan lebih simple
        */
        
        int[] iniArray3 = new int[]{
            6,5,4,3,2,1
        };
        /*
        Source code dibawah ini digunakan untuk memanggil array
        yang sudah dibuat sebelumnya
        */
        
        System.out.println(iniArray3 [1]);
        System.out.println(iniArray3 [2]);
        System.out.println(iniArray3 [3]);
        System.out.println(iniArray3 [4]);
        System.out.println(iniArray3 [5]);
        System.out.println(iniArray3 [6]);
        
        /*
        Soure code dibawah ini adalah digunakan untuk membuat sebuah
        array 2 demensi yang mana penggunaan array dua dimensi ini 
        yaitu baris kolom 
        */
        String[][] arrayMulti = new String[][] {
            {"Agusti", "Bayu"},
            {"Reka", "Nanda"},
            {"Cahya", "Bima"}       
        };
        
        System.out.println(arrayMulti [0][1]);
        System.out.println(arrayMulti [1][0]);
        System.out.println(arrayMulti [1][1]);
     
        
        
                
    }
    
}
