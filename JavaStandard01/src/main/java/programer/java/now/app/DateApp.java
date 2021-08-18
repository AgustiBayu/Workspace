package programer.java.now.app;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/*
    dalam source code dibawah ini terdapat sebuah calculation script yang mana
    digunakan untuk memanipulasi sebuah tanggal dengan menggunakan 2 keyword
    date dan calender 
*/

public class DateApp {
    public static void main(String[] args) {
        
        //membuat objek date dan meng inport java.util
        Date tanggal = new Date();     
        //menampilkan tanggal hari ini saat di compile
        System.out.println(tanggal);
        
        //membuat objek calender dan inport java.util 
        Calendar calender = Calendar.getInstance();        
        calender.set(calender.YEAR, 2000); //merubah ouput tahun 
        calender.set(calender.MONTH, calender.JULY); //merubah ouput bulan
        calender.set(calender.HOUR_OF_DAY, 11); //merubah ouput jam
        /*
        dalam source dibawah ini terdapat sebuah method add yang digunakan
        untuk mengurang " - " dan menambah " + " 
        */
        calender.add(calender.YEAR, -20);
        
        //digunakan untuk mengkonversi objek calender menjadi date
        Date result = calender.getTime();
        System.out.println(result);
    }
    
}
