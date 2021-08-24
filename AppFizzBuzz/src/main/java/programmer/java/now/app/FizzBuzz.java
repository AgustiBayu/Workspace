package programmer.java.now.app;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Input Number ");
      
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if ((i % 7 == 0) && (i % 9 == 0)) { // if fizzbuzz 7 dan 9 habis dibagi maka result fizzbuzz
                System.out.println("FizzBuzz");
            } else if ((i % 7) == 0) {
                System.out.println("Fizz"); // if fizz nilai habis dibagi 7 maka result fizz
            } else if ((i % 9) == 0) {
                System.out.println("Buzz"); // if buzz nilai habis dibagi 9 maka result buzz
            } else {
                System.out.println(i);
            }
        }

    }

}
