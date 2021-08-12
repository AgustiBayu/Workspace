package com.mycompany.javaoop01;


public class MobilApp {
    public static void main(String[] args) {
        
        Mobil avansa = new Mobil ();
        avansa.name = "Agusti Bayu Samudro";
        avansa.alamat = "Bayuwangi Tapanrejo";
        
        /*untuk varible konstan final tidak dapat dideklarasikan
        karena bernilai tetap sehingga dalam ouput hanya tinggal
        dipanggil seperti ouput no3
        */
        
        System.out.println(avansa.name);
        System.out.println(avansa.alamat);
        System.out.println(avansa.NEGARA);
        //Untuk memanggil method hanya tinggal panggil objek. nama method
        avansa.namaPengirim("Supri Adi");
        
        
        Mobil xenia = new Mobil();
        xenia.name = "Reka Nanda Putri";
        xenia.alamat = "Madura";
        
        System.out.println("");
        System.out.println(xenia.name);
        System.out.println(xenia.alamat);
        System.out.println(xenia.NEGARA);
        //Untuk memanggil method hanya tinggal panggil objek. nama method
        xenia.namaPengirim("Supri Adi");
        
        /*
        Souece code dibawah ini merupakan sebuah mehtod constructor yang mana
        method ini mempermudah programer dengan langsung mengisikan data dalam
        method ketika awal membuat sebuah objek sehingga tidak repot lagi membuat
        atau mengisikan faild perhatikan dalam class mobil2.java untuk memahaminya
        */
        Mobil2 testConstructor = new Mobil2("Handi Siswanto", "Lucas Shalom");
        
        System.out.println(testConstructor.pegawai);
        System.out.println(testConstructor.pemilik);
        
        //Contoh constructor over loading perhatikan constructornya dimobil2
        Mobil2 testConstructor2 = new Mobil2("Soeleman");
        
        System.out.println(testConstructor2.pemilik);
        
        /*
        Dalam constructor dibawah ini agak sedikit berbeda karena merupakan
        constructor tanpa parameter yang mana cara mengisi varible dilakaukan
        dengan cara manual seperti method pada biasanya
        */
        Mobil2 testConstructor3 = new Mobil2();
        testConstructor3.pegawai = "Alibaba";
        
        System.out.println(testConstructor3.pegawai);
    }
    
}
