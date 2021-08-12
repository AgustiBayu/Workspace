package programer.java.now.data;

/*
interface dengan interface dapat diturunkan dengan menggunakan keyword
extends namun berbeda dengan interface turunan class yaitu dengan menggunakan
keyword implements, interface juga bisa multiple yaitu bisa dipisahkan dengan
tanda " , "/koma.
*/
public interface Sepeda extends SepedaBaru,Maintenance{//contoh interface multiple
    
    //implementasi method interface dalam java
    public abstract void setSepeda();
    
    //implementasi method interface dalam java
    int getRoda();
    
   /*
    dalam interface sebenarnya tidak dapat mengcreate full method namu bila
    ingin menggunakan full method bisa menggunakan sebuah keyword default
    seperti dibawah ini dan sesuaikan dengan class turunanan nya
    */
    public default boolean isBig(){
        return true;
    }
}
