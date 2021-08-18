package programer.java.now.app;

// digunakan untuk mengimport suatu data yang uniq dalam java
import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        
        // calculation script mencari data yang uniq dengan uuid
        for(int i = 0; i<10; i++){            
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
                        
            String primaryKey = uuid.toString();// convert uuid menjadi string
            System.out.println(primaryKey);
        }
        
    }
    
}
