package programer.java.now.data;

import java.util.Objects;

public class Sepatu {
    
   public String name;
   public int price;
    
    public Sepatu(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return ("Hi, my name is "+ name +" harga sepatu saya "+ price);
    }
    /*
    Dalam sourcecode dibawah ini merupakan sebuah method equal yang mana method
    ini akan membandingkan hasil sesuai atau tidak sesuai pada objek application
    sehingga programer tidak menemui masalah ketika menggunakan objek
    */
   
    public boolean equals(Object ob){
        /*
        getclass digunakan untuk menggunakan parameter objek yang mana bila sourcecode getclass
        tidak dibandingkan maka harus mengi import java until objects sehingga penggunaan getclass
        ini sangat diperlukan supaya mempermudah programer
        */
        if(ob == this) return true;
        if(ob == null || getClass() != ob.getClass()) return false;
        
        /* cara ke 2 bisa implentasi get class seperti dibawah ini 
        atau seseuai dengan diatas, fungsi operatot " || " /atau ini
        digunakan untuk menggabung kedua source code
        
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        */
        
        Sepatu sepatu = (Sepatu) ob;
        
        if(price != sepatu.price) return false;
        if(name != null){
            return this.name.equals(sepatu.name);
        }
        else{
            return sepatu.name == null;
        }
    }
    /*
    dalam penggunaan hashcode ini berfungsi untuk membandikan suatu objek
    dalam application hampir sama dengan method equals namun hashcode ini 
    mengembalikan tipedata integer
    */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.price;
        return hash;
    }
    
    

}
