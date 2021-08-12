package programer.java.now.data;

/*
Sourcecode dibawah ini merupakan sebuah interface yang mana 
interface ini hampisama dengan abstrack melainkan berbeda cara
menurunkan class nya interface ini menggunakan implement untuk 
menurunkan class nya dan menggunakan polymorphism dcan dalam method
tidak perlu menggunakan "{ }";
*/

//untuk membuat class interface pilih java interface bukan java class lagi
//untuk membuat class turunanya bisa menggunakan java class biasa
public interface Mobil {
    
    //deklarasi method interface dalam suatu class ada 2 macam 
    public abstract void jenisKendaraan();
    
    // default dari method interface 
    int getRoda();
        
}
