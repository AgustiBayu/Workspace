package programer.java.now.util;

import programer.java.now.data.LoginRequest;
import programer.java.now.error.ValidationException;

/*
sourcecode dibawah ini merupakan type cheket exception yaitu sebuah validasi atau mengkonek class
loginrequest dengan class validationexception sehingga bila input tidak 
sesuai maka notif error yang sudah di set dibawah ini akan di tampilkan
*/
public class ValidationUtil {
    
    /*
    source code dibawah ini merupakan method yang berhubungan dengan  loginRequest 
    throws berfungsi untuk menghubungkan class dan throw new berfungsi untuk manampilkan
    output mirip dengan return
    */
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if(loginRequest.getUser() == null){
            throw new ValidationException("User tidak boleh null");
        }else if(loginRequest.getUser().isEmpty()){
           throw new ValidationException("User name tidak boleh kosong");
        }else if(loginRequest.getPass() == null){
            throw new ValidationException("Password tidak boleh null");
        }else if(loginRequest.getPass().isEmpty()){
           throw new ValidationException("Password name tidak boleh kosong");
        }
    }
    
}
