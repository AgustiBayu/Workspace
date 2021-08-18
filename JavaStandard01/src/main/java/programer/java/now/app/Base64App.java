package programer.java.now.app;

import java.util.Base64;

//dalam sourcecode dibawah ini digunakan untuk membuat suatu encoding base64
    
public class Base64App {
    public static void main(String[] args) {
        
        String original = "Reka Nanda Putri";// data awal kata asli
        
        // calculation script membuat encoding
        String encodet = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encodet);
        
        // calculation script mengembalikan encoding
        byte[] bytes = Base64.getDecoder().decode(encodet);
        String result = new String(bytes);// mengkonvert tipedata byte ke string
        System.out.println(result);
        
    }
    
}
