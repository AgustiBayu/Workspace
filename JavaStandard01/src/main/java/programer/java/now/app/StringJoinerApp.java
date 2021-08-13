package programer.java.now.app;

import java.util.StringJoiner;

/*
dalam sourcecode dibawah ini merupakan sebuah manipulasi sebuah stringjoiner
yang digunakan untuk memanipulasi output dalam suatu string

*/

public class StringJoinerApp {
    public static void main(String[] args) {
        
        /*
        dalam objek joiner terdapat 3 bagian utama yaitu delimeter/pemisah
        profix/awalan, dan terakhir adalah suffix/akhiran 
        */
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        joiner.add("Agusti");//join add digunakan untuk mengisi field
        joiner.add("Bayu");
        joiner.add("Samudro");
        
        // oiner harus dikonvert menjadi tostring dan disimpan dalam variable
        String value = joiner.toString();
        System.out.println(value);
    }
    
}
