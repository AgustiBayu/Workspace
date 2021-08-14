package programer.java.now.app;

/*
    Dalam source code dibawah ini merupakan sebuah konversi tipedata non
    primitif dengan inilai awal menggunakan sebuah variable intvalue kemudian
    dikonversi menjadi beberapa tipedata non primitif seperti dibawah ini untuk
    contohnya.
*/

public class NumberApp {
    public static void main(String[] args) {
        
        // Konversi numbering non primitif
        Integer intValue = 100;
        Long longValue = intValue.longValue();
        Short shortValue = longValue.shortValue();
        
        System.out.println(longValue);
        System.out.println(shortValue);
    }
/*
    Source code dibawah ini merupakan sebuah code untuk mengkonversi sebuah 
    tipedata string menjadi sebuah tipedata numbering yang biasanya sering 
    terjadi dalam prgramer
*/        
    {
        String contoh = "20000";
        
        //Konversi String menjadi tipedata non primitif
        Integer contohInteger = Integer.valueOf(contoh);
        System.out.println(contohInteger);
        
        //Konversi String menjadi tipedata primitif. perlu diperhatikan untuk
        //konversi ini perlu menggunakan tipedata non primitif karena tipedata
        //ini mempunya sebuah method default dari java
        short contohShort = Short.parseShort(contoh);
        System.out.println(contohShort);
    }
    
    
    
}
