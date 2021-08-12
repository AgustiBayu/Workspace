package com.mycompany.belajarjava06;


public class OperasiMatematik {
    public static void main(String[] args) {
        
        /*
        Source code dibawah ini digunakan untuk membuat sebuah
        oprasi matematika dasar dan penerapanya
        */
        
        byte a = 100;
        byte b = 9;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        {
        /*
        Source code dibawah ini digunakan untuk membuat
        sebuah penjumlahan dengan dirinya sendiri atau bisa 
        dikenal augmented assignments
        */
        
        short c = 90;
        
        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);
        
        }
        
        {
        /*
        Source code dibawah ini digunakan untuk mempermudah suatu pengurangan
        dengan dirinya sendiri atau bisa dikenal dengan unery ++ untuk increment
        dan -- untuk deincrement
        */
        
        byte data = 10;
        
        data++;
        System.out.println(data);
        
        data--;
        System.out.println(data);
        
        }
        {
        /*
        Dalam source code diatas terdapat sebuah operator pembanding
        yang selayaknya seperti bahasa pemrograman bisanya contoh pernerapan
        nya seperti dibawah ini 
        */
        
        int nilaiPertama = 100;
        int nilaiKedua = 100;
        
        System.out.println(nilaiPertama < nilaiKedua);
        System.out.println(nilaiPertama > nilaiKedua);
        System.out.println(nilaiPertama <= nilaiKedua);
        System.out.println(nilaiPertama >= nilaiKedua);
        System.out.println(nilaiPertama == nilaiKedua);
        System.out.println(nilaiPertama != nilaiKedua);
        
        System.out.println();
        System.out.println();
        
        }
        {
        /*
        Dalam source code dibawah ini menggunakan operator logika and
        yang mana bila salah satu dari nilai bernilai false maka hasilnya
        akan menjadi false dan apabila kedua nilai bernilai true maka nilai
        akan akan bernilai true
        */
        
        byte absen = 70;
        byte nilaiAkhir = 70;
        
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        
        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
       
        byte absen2 = 85;
        byte nilaiAkhir2 = 75;
        
        boolean lulusAbsen2 = absen2 >= 75;
        boolean lulusNilai2 = nilaiAkhir2 >= 75;
        
        boolean lulus2 = lulusAbsen2 && lulusNilai2;
        System.out.println(lulus2);
       
        } 
        /*
        Penggunaan block sangat disarankan untuk mengelompokan 
        source code yang berbeda supaya dapat memudahkan untuk 
        dibaca progremer countuh block "{ }"
        */
        
    }
    
}
