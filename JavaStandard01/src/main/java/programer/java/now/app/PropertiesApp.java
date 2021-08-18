package programer.java.now.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        
/*
   Daalam source code dibawah ini digunakan untuk menyimpan suatu file properties
   dengan menggunakan keyword dalam java 
*/       
       try {           
        Properties properties = new Properties();// membuat objek properties
        properties.put("name.Frist", "Agusti");//put berfungsi untuk membuat isi
        properties.put("name.middle", "Bayu");
        properties.put("name.last", "Samudro");
        
        //store berfungsi untuk mengesave hasil isi ke file
        properties.store(new FileOutputStream("application.properties"), "Konfigurasi nama");
           
       }catch(FileNotFoundException exception){//digunakan saat output error dan sesuaikan
           System.out.println("Error menyimpan properties");           
       }catch(IOException exception){//digunakan saat output error dan sesuaikan
           System.out.println("Error menyimpan properties");
       }
         
        
    }
    
}
