package programer.java.now.app;

/*
string merupakan sebuah tipedata non primitif sehingga dalam bahasa pemrograman
java string mempunyai sebuah default method dari java itu sendiri
*/
public class StringApp {
    public static void main(String[] args) {
        
        String name = "Agusti Bayu Samudro";
        System.out.println(name);
        
        //mengkonversi output string menjadi non kapitalic atau lower
        String nameLowerCase = name.toLowerCase();
        System.out.println(nameLowerCase);
        
        //mengkonversi output string menjadi kapitalic atau upper
        String nameUppercase = name.toUpperCase();
        System.out.println(nameUppercase);
        
        System.out.println(name.length());//mtehod length digunakan untuk mengihitung jumlah karakter
        System.out.println(name.startsWith("Agusti"));//method startswish digunakan untuk mengecek awalan dari sebuah output string
        System.out.println(name.endsWith("Samudro"));//method endswith diguanakan untuk mengecek akhiran dari sebuah output string    
        
        /*
        source code dibawah ini digunakan untuk memotong suatu string name
        yang sudah di inisialisaikan diatas, dalam code dibawah ini yang menjadi target
        untuk memisahkan adalah " "/ spasi, sepasi juga termasuk dalam karakter
        */
        String[] names = name.split(" ");
        for(String value : names){
            System.out.println(value);
        }
    }
    
}
