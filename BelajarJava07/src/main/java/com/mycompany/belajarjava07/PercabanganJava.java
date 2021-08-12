package com.mycompany.belajarjava07;


public class PercabanganJava {
    public static void main(String[] args) {
        
        /*
        Dalam source code diatas digunakan untuk membuat sebuah
        percabangan if yang dimana percabangan ini harus bernilai
        boolean sesuaikan dengan kondisi 
        */
        
        byte absen = 60;
        byte nilai = 70;
        
        if(absen >= 75 && nilai >= 75){
            System.out.println("Anda lulus");
        }
        else{
            System.out.println("Anda Tidak Lulus");
        }
        
        /*
        Dalam source code diatas digunakan untuk membuat sebuah
        percabangan if else yang dimana percabangan ini hampirsama 
        dengan percabangan yang berada dalam bahasa pemrograman lainya
        */
        
        {
            if(absen >= 80 && nilai >=80){
                System.out.println("Gread anda A");
            }
            else if(absen >= 70 && nilai >=70){
                System.out.println("Gread anda B");
            }
            else if(absen >= 70 && nilai >=70){
                System.out.println("Gread anda B");
            }
            else if(absen >= 60 && nilai >=60){
                System.out.println("Gread anda C");
            }
            else if(absen >= 50 && nilai >=50){
                System.out.println("Gread anda C+");
            }
            else if(absen >= 40 && nilai >=40){
                System.out.println("Gread anda C+");
            }
            else {
                System.out.println("Ulang tahun depan");
            }
        }
        
        /*
        Dalam Source code diabawah ini merupakan percabangan menggunakan
        switch case yang mana percabangan ini digunakan untuk mode lebih 
        sederhana dibandingkan if else / if stetment
        */
        
        {
            char nilaiKu = 'B';
            
            switch (nilaiKu){
                case 'A' :
                    System.out.println("Nilai Anda Sangat Baik");
                break;
                case 'B' :
                    System.out.println("Nilai Anda Cukup Baik");
                break;
                case 'C' :
                    System.out.println("Nilai Anda Baik");
                break;
                case 'D' :
                    System.out.println("Nilai Anda Cukup");
                break;
                default :
                    System.out.println("Anda Salah Jurusan");
            }
        }
        
        /*
        Dalam source code diatas merupakan sebuah percabangan ternary
        yang dimana percabangan ini sangat mempersingkat programer pengertian
        dati tanda petik <- menandakan keadaan true dan arah -> kebalikanya
        */
        
        {
            byte nilaiKu = 75;
            
            System.out.println(nilaiKu >= 80 ? "Anda Lulus" : "Maaf Anda Tidak Lulus");
        }
    }
    
}
