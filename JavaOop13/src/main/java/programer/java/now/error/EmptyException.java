package programer.java.now.error;

/*
sourcecode dibawah ini digunakan untuk menampilkan sebuah notifikasi eror 
dalam class logisrequest. RuntimeException merupakan keyword default dari java
*/
public class EmptyException extends RuntimeException{
    
    public EmptyException(String massege){
        super(massege);
    }
    
}
