package programer.java.now.app;

import programer.java.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        
        /*
        dalam penggunaan anonymous class ini merupakan outer dari class
        induk dari helloworld yang mana class outer merupakan sebuah interface
        jadi dengan menggunakan anonymous ini programer tidak perlu lagi implementasi
        lagi dengan membuat class, sehingga method dari interfece dapat ditampikan seperti 
        contoh diibawah ini
        */
        
        HelloWorld english = new HelloWorld(){//penggunaan anonymous ini objek menggunakan tanda "{ };"
                                              // Setelah itu bisa memanggil method dalam kelas interface helloworld
            
            public void sayHello(){
                System.out.println("Hello");
            }
            
            public void sayHello(String name){
                System.out.println("Hello "+ name);
            }
        };
            english.sayHello();
            english.sayHello("Agusti");
        }
        
    }
    

