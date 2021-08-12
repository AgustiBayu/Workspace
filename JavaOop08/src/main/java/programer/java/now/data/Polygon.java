package programer.java.now.data;


public class Polygon implements Sepeda{
    
    public void setSepeda(){
        System.out.println("Sepedaku Plygon");
    }
    
    public int getRoda(){
        return 2;
    }
    
    public void jenisSepeda(){
        System.out.println("Sepeda Baruku BMX");
    }
    
    public boolean isMaintenace(){
        return false ;
    }
    
    /*
    ini merupakan method yang menggunakan default method yang mana
    kenapa nilai return class induk dengan class turunan berbeda karena
    ini merupakan method overriding atau shadowing dan bila ingin ouput dari
    induk bisa menggunakan keyword super
    */
    public boolean isBig(){
        return true;
    }
}
