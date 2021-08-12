package programer.java.now.data;

/*
Dalam sourcecode dibawah ini merupakan sebuah method
yang mana terdapat sebuah keyword static yang mana jika method
di set dengan menggunakan keyword static maka bisa diakses tanpa menggunakan
atau implementasi sebuah objek.
*/

public class StaticMethod {
    
    // method digunakan untuk menjumlah suatu output
    public static int sum(int... values){
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }
    
}
