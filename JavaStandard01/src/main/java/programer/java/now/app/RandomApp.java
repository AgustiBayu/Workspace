package programer.java.now.app;

import java.util.Random;

/*
    dalam source code dibawah ini merupakan sebuah romdom number dengan 
    menggunakan tipedata int dengan mengimport java.util.Random dalam 
    code 
*/

public class RandomApp {
    public static void main(String[] args) {
        
        Random random = new Random();
        for(int i = 1; i<10; i++){
            // rondom nextint digunakan untuk batas dari output random
            int value = random.nextInt(1000);
            System.out.println(value);
        }        
        
    }
    
}
