package programer.java.now.app;

import programer.java.now.data.LoginRequest;
import programer.java.now.error.ValidationException;
import programer.java.now.util.ValidationUtil;
import programer.java.now.util.EmptyUtil;

public class ValidationApp {
    public static void main(String[] args) {
        
        LoginRequest loginReques = new LoginRequest("", "rhs");
        
        /*
        untuk menampilkan sourcecode validationexception dalam java
        maka dibutuhkan keyword try catch atau biasa dikenal sebagai cheked exception contoh seperti dibawah ini
        */
        try{
            ValidationUtil.validate(loginReques);//memanggil method dalam class Validationutil
            System.out.println("Data valit");
            
            //jika data tidak valit maka akan di exsekusi exception merupakan varible penampung bisa dirubah dan sesuaikan
        }catch(ValidationException exception){
            System.out.println("Data tidak valit "+ exception.getMessage());
        }finally{//keyword finally akan selalu ditampilkan boleh dipakai boleh tidak
            System.out.println("Selalu di eksekusi sesuaikan kondisi");
        }
        
        /*
        Sourcecode objek dibawah ini merupakan sebuah exception runtime yang mana
        akan memberikan notifikasi sukses terhadap objek login namun bila objek
        salah maka output akan eror
        */
        LoginRequest loginReques2 = new LoginRequest("Agusti", "qwert");
        EmptyUtil.ValidateRuntime(loginReques2);
        System.out.println("Sukses");
        
        
    }
}
