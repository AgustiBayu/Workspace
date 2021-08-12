package programer.java.now.app;


public class StackTraceApp {
    public static void main(String[] args) {
        
        /*
        dalam sourcecode dibawah ini merupakan sebuah try catsh yang mana digunakan
        untuk mendeteksi error dalam suatu program dalam java sehingga programer sangat
        terbantu jika terjadi bag dalam sourcecode nya. deteksi type cheked exception
        */
        
        try{            
            String[] name ={
                "Agusti", "Bayu", "Samudro"
            };
            System.out.println(name [1]);
            
        }catch(Throwable throwable){
            throwable.printStackTrace();
        }
        
        /*
        sourcecode dibawah ini digunakan untuk mengambil data dalam method sample error
        dan untuk mengambil datanya harus menggunakan try cath seperti contoh dibawah ini
        */
        {
            System.out.println("");
            System.out.println("Berbeda argumen");
            try{                
                sampleError();                
            }catch(RuntimeException exception){
                exception.printStackTrace();
            }
        }               
    }
    
    public static void sampleError(){
        
        /*
        dalam sourcecode dibawah ini merupakan sebuah method yang menggunakan 
        keyword try catsh yang mana digunakan untuk mendeteksi letak error yang terjadi
        dalam sebuah method dalam type deteksi ini menggunakan runtime exception 
        */
         try{            
            String[] name ={
                "Agusti", "Bayu", "Samudro"
            };
            System.out.println(name [100]);
            
        }catch(Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
