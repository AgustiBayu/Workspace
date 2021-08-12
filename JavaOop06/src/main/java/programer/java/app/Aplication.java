package programer.java.app;

import programer.java.data.Employee;
// atau juga bisa dengan import programer.java.data.*; 
// fungsi sourcecode diatas yaitu mengimport semua class di package berbeda
//sehingga tidak import satu persatu

/*
Dalam source code dibawah ini merupakan sebuah class diluar dari packege 
sehingga dalam memunculkan data harus import terlebih dahulu dan sesuaikan
dengan modifier untuk running dalam package yang berbeda seperti ini klik kananan
-> run file, kalau memnggunakan run project diatas hasil runing yang dijalakan di
package sebelumnya karena disini saya dekskripsikan class main/ main 2 kali 
*/
public class Aplication {
    public static void main(String[] args) {
        
        Employee employee2 = new Employee("Reka", 2001);
        employee2.getEmployee("Neni");
        System.out.println(employee2.name);
        System.out.println(employee2.umur);
    }
}
