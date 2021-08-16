package programer.java.now.app;

//digunakan untuk menggunakan input dalam java
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        
        //membuat objek inputan scanner dalam java
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama anda :");//output
        String nama = scanner.nextLine();//membuat inputan dalam user
        
        System.out.println("Masukan umur :");
        Integer usia = scanner.nextInt();
        
        //memanggil varible yang sudah di inisialisasi dengan scanner
        System.out.println("Nama :"+ nama +" Umur :"+ usia +"tahun");
        
    }    
}
