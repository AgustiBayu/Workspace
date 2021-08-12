package programer.java.now.data;

public class LoginRequest {
    
    private String username;
    private String password;
    
    public LoginRequest(String username, String password){
        this.username = username;
        this.password = password;
    }
    
   public String getUser(){
       return username;
   }
   
    public String getPass(){
       return password;
   }
}
