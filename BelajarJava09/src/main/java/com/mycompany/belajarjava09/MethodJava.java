package com.mycompany.belajarjava09;


public class MethodJava {
    public static void main(String[] args) {
        
        sayHelloBayu();
        sayHelloAgusti("Agusti", "Bayu Samudro");
        System.out.println(jumlah(10, 10));
        System.out.println(hitung(20, "+", 5));
        System.out.println("");
        
        System.out.println(myData("Agusti Bayu", 70,80,30,40,90));
    }
    
    /*
    Dalam source code diatas digunakan untuk membuat sebuah
    method atau juga dikenal sebagai fungsi yang mana method 
    ini digunakan untuk mempermudah atau memperingkas progremer
    method dibawah ini merupakan method tanpa parameter
    */
    static void sayHelloBayu(){
        System.out.println("Hello Agusti");
        System.out.println("Hello Bayu");
        System.out.println("Hello Samudro");
    }
    
    /*
    Dalam source code dibawah ini merupakan method void dengan
    parameter yang mana dalam method ini persis dengan membuat
    sebuah variabel biasa namun diisikan didalam tanda kurung dan
    untuk mengisi nya langsung di implentasikan di dalam fungsi 
    utama atau main class
    */
    static void sayHelloAgusti(String firstName, String lastName){
        System.out.println("Hello "+firstName+ " " +lastName);
    }
    
    /*
    Dalam source code dibawah ini merupakan sebuah fungsi atau method
    yang mana fungsi ini digunakan untuk membuat nilai kembalian atau return
    */
    static int jumlah(int a, int b){
        int total = a + b;
        return total;
    }
    
    /*
    Dalam Source code dibawah ini merupakan method non void yang mana
    method ini memiliki kondisi retrun yang bila salah satu dalam kondisi
    switch terpenuhi maka akan dijalankan di fungsi utamanya main 
    */
    
    static int hitung (int c, String oprasi, int d){
        switch (oprasi){
            case "+":
                return c + d;
            case "-":
                return c - d;
            case "*":
                return c * d;
            default :
                return 0;
        }
        
    }
    
}
