package programer.java.now.util;

import programer.java.now.data.LoginRequest;
import programer.java.now.error.EmptyException;

/*
sourcecode dibawah ini merupakan type runtime exception yaitu sebuah validasi atau mengkonek class
loginrequest dengan class emptyexception sehingga bila input tidak 
sesuai maka notif error yang sudah di set dibawah ini akan di tampilkan
*/

public class EmptyUtil {
       
     /*
    source code dibawah ini merupakan method yang berhubungan dengan  loginRequest 
    yang berfungsi untuk menghubungkan class dan throw new berfungsi untuk manampilkan
    output mirip dengan return
    */
   public static void ValidateRuntime(LoginRequest loginRequest){
       if(loginRequest.getUser() == null){
           throw new NullPointerException("User : isNull");
       }else if(loginRequest.getUser().isEmpty()){
           throw new EmptyException("User : isEmpty");
       }else if(loginRequest.getPass() == null){
           throw new NullPointerException("Password : isNull");
       }else if(loginRequest.getPass().isEmpty()){
           throw new EmptyException("Password : isEmpty");
       }
   }
    
}
