package programer.java.now.error;

/*
sourcecode dibawah ini digunakan untuk menampilkan sebuah notifikasi eror 
dalam class logisrequest.Throwable merupakan keyword default dari java
*/
public class ValidationException extends Throwable{

    public ValidationException(String massege){
        
        super(massege);
    }
}