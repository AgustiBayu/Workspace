package programer.java.now.app;


public class EqualsApp {
    public static void main(String[] args) {
        
        String frist = "Agusti";
        frist = frist+ " " +"Bayu Samudro";
        
        System.out.println(frist);
        
        String name = "Agusti Bayu Samudro";
        System.out.println(name);
        
        /*
        Membandingkan sebuah objek non primitif tidak bisa menggunakan 
        " == " meskipun kedua objek ouput sama tetapi mereka independen
        dan disimpan dalam memori yang berbeda maka diperlukan keyword
        equals
        */
        System.out.println(frist == name);
        
        /*
        sourcecode dibawah ini merupakan sebuah pembandingan output
        dengan menggunakan equals. fungsi keyword ini digunakan untuk 
        membandingkan output dalam sebuah objek apakah sama atau tidak
        dengan syarat objek harus bertipe data non primitif
        */
        System.out.println(frist.equals(name));
    }
    
}
