package programer.java.now.app;

import java.math.BigDecimal;
import java.math.BigInteger;


public class BigNumberApp {
    public static void main(String[] args) {
        
/*
    Dalam source code dibawah ini merupakan sebuah metode aritmatika yang
    melebihi kapasitas dari suatu tipedata long yang bisa saja terjadi dalam
    suatu program. dan sebab java menyediakan default biginteger untuk menjumlah
    field, biginteger digunakan untuk bilangan bulat
*/        
        
        BigInteger a = new BigInteger("100000000000000000");
        BigInteger b = new BigInteger("200000000000000000");
        
        BigInteger hasilTabah = a.add(b);
        System.out.println(hasilTabah);
        
        BigInteger hasilKurang = b.subtract(a);
        System.out.println(hasilKurang);
        
        BigInteger hasilKali = a.multiply(b);
        System.out.println(hasilKali);
        
        BigInteger hasilBagi = b.divide(a);
        System.out.println(hasilBagi);
        
        BigInteger halisMod = b.mod(a);
        System.out.println(halisMod);
        System.out.println("");     
        
    {     
        //penerapan menggunakan floatingPoint untuk keyword hampir sama 
        BigDecimal i = new BigDecimal("3000.40000000000");
        BigDecimal j = new BigDecimal("6000.45000000000");
        
        BigDecimal resultTambah = i.add(j);
        System.out.println(resultTambah);        
    }  
    }
    
}
