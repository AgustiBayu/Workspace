package com.mycompany.belajarjava10;


public class MethodVarible {
    public static void main(String[] args) {
        
        int[] values = new int[]//mengisikan data array
        {
            80,80,80,80,80
        };
        dataNilaiKu("Agusti Bayu Samudro", values);
        System.out.println("");
        
        dataNilaiKu2("Reka Nanda Putri", 80,80,80,80,90);//tidak perlu mengisikan varible array varible argument
    }
    
    static void dataNilaiKu(String name, int[] values){
        
        int total = 0;
        for (int value : values){
            total += value;
        }
        int dataku = total / values.length;
            if(dataku >= 75){
                System.out.println("Selamat "+ name +" Anda Lulus");
            }
            else{
                System.out.println("Maaf "+name + " Anda Tidak Lulus");
            }
    }
    
    /*
    Dalam source code dibawah ini merupakan sebuah varible argumen yang mana
    varible ini untuk mempermudah progremer untuk mempersingkat sebuah varible
    array seperti source code diatas dan ketika ingin output tinggal memasukan
    data dan tidak perlu untuk  mengisikannya di array
    */
    
    static void dataNilaiKu2(String name, int... values){
        
        int total = 0;
        for (int value : values){
            total += value;
        }
        int dataku = total / values.length;
            if(dataku >= 75){
                System.out.println("Selamat "+ name +" Anda Lulus");
            }
            else{
                System.out.println("Maaf "+name + " Anda Tidak Lulus");
            }
            
    }
}

