package programer.java.now.app;

import programer.java.now.data.LoginRequest;

public class LoginRequestApp {
    public static void main(String[] args) {
        
        LoginRequest login = new LoginRequest("Agusti", "qwerty");
        System.out.println(login.getUser());
        System.out.println(login.getPass());
        
        
    }
    
}
