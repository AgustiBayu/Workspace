package programer.java.now.app;

import java.util.Objects;

/** penerapan method dalam souce code Objects
 * method getter & setter
 * method equels & hashcode
 * method constructor
 * method tostring
 * method void static 
 */

public class ObjectsApp {
    
    public static class Data {
        
        private String data;

        public Data(String data) {
            this.data = data;
        }                

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 13 * hash + Objects.hashCode(this.data);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final data other = (data) obj;
            if (!Objects.equals(this.data, other.data)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Data{" + "data=" + data + '}';
        }
    }
    
    public static void main(String[] args) {
        
        execute(new Data("Agusti"));
        
    }
    
    public static void execute(Data data ){
        
     /*   
       if(data != null){           
        System.out.println(data.toString());
        System.out.println(data.hashCode());
       }
     */  
        
     /*
        dalam source code dibawah ini merupakan sebuah code yang digunakanu 
        untuk menampilkan sebuah tostring dan hashcode sebagai contoh dalam
        output method bisa dengan 2 calculation script yang pertama bisa menggu
        nakan if steatment seperti contoh diatas dan juga menggunakan keyword
        objects seperti dibawah ini
     */
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
    
}
