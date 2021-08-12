package programer.java.now.app;

import programer.java.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        
        connectionDatabase("agusti", "qwer");
        System.out.println("Sukses");
    }
    
    //sebuah method yang akan di implementasikan di mainclass
    public static void connectionDatabase(String username, String password){
        if(username == null || password == null){
            //dalam exception dibawah ini merupakan type error
            throw new DatabaseError("Tidak Bisa connect ke daabase");
        }
    }
}
