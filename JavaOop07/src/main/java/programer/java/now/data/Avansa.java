package programer.java.now.data;

/*
class dibawah ini merupakan turunan dari class interface mobil
yang bersifat hampir sama dengan abstrack namun cara menurunanya
berbeda menggunakan implements dan untuk mengisi methodnya di class
turunanya namun method harus sama seperti di class mobil karena dalam
class avansa ini method hanya di set ulang 
*/
public class Avansa implements Mobil{
    
    public void jenisKendaraan(){
        System.out.println("Mobilku Avansa");
    }
    
    public int getRoda(){
        return 4;
    }
    
}
