package programer.java.now.app;

import java.util.Arrays;


public class ArraysApp {
    public static void main(String[] args) {
        
        int[] value = {
            20,5,12,75,86,33,24,79,73,16,25,17
        };
        
        Arrays.sort(value);// source code untuk mengurutkan data array
        System.out.println(Arrays.toString(value));// konversi menjadi string
        
        // menggunakan selection binarysearch structur data
        System.out.println(Arrays.binarySearch(value, 25));
        System.out.println(Arrays.binarySearch(value, 17));
        // jika hasil tidak ditemukan maka output akan bernilai min
        System.out.println(Arrays.binarySearch(value, 1000));
        
        //mencari data arrar dari 1 sampai 5
        int[] result = Arrays.copyOf(value, 5);
        System.out.println(Arrays.toString(result));
        
        //mencari data array dari 5 ke 10 atau disebut rangs
        int[] result2 = Arrays.copyOfRange(value, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
    
}
