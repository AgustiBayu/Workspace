package programer.java.now.data;

/*
dalam source code dibawah ini merupakan sebuah static block yang mana
digunakan untuk mengecek processor dalam laptop programer. perlu di inggat
bahwa block static ini hanya bisa mengakses static method atau static varible
*/

public class Application {
    
    public static final int PROCESSOR;
    
    static {
        System.out.println("Mengakses Block class dalam java");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
    
}
