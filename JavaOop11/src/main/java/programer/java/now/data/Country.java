package programer.java.now.data;

/*
dalam sourcecode dibawah ini merupakan sebuah inner class
dalam penggunaan static dalam inner class ini terdapat di class
turunannya saja yang dapat di implementasikan dengan menggunakan 
keyword static. jika turunan sudah di set dengan menggunakan keyword
static maka class inner bisa langsung dapat diakses namun class inner tidak
dapat mengakses outer class nya
*/

public class Country {
    
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public static class City {
        
        private String name;
        
        public String getName(){
            return name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
    }
}
