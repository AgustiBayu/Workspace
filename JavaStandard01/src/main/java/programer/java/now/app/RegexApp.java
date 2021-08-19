package programer.java.now.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    sourcecode dibawah ini merupakan reguler expression yang mana digunakan
    untuk mencari atau seacr data dalam suatu tampungan variable
*/
public class RegexApp {
    public static void main(String[] args) {
        
        // kalimat utama 
        String nameValue = "Agusti Bayu Samudro Reka Nanda Putri";
       
        //sourcecode dibawah ini digunakan untuk mencari data dari huruf a-z
        //dan A-Z " * " digunakan untuk memunculkan data tanpa memperhatikan 
        //banyak hurufnya " a " digunakan untuk huruf tengah yang akan dicari
        Pattern pattern = Pattern.compile("[a-zA-z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(nameValue);
        
        //digunakan untuk memunculkan kalimat yang sudah di filter dengan
        //menggunakan matcher find 
        while(matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
        
    }
    
}
