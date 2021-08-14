package programer.java.now.app;

import java.util.StringTokenizer;

/*
dalam sourcecode dibawah ini merupakan sebuah manipulasi stringtokenizer
yang digunakan untuk memotong/memisah sebuah string hampir sama dengan slite
namun tokenizer lebih hemat penyimpanan
*/

public class StringTokenizerApp {
    public static void main(String[] args) {
        
        String name = "Agusti Bayu Samudro";
        
        //cara membuat objek tokenizer name/field, spasi sebagai delimeter/
        //atau pemisah
        StringTokenizer tokenizer = new StringTokenizer(name, " ");        
        while(tokenizer.hasMoreTokens()){
            String value = tokenizer.nextToken();
            System.out.println(value);
        }
        
    }
    
}
