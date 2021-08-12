package programer.java.now.app;

import programer.java.now.data.Polygon;
import programer.java.now.data.Sepeda;

public class SepedaApp {
    public static void main(String[] args) {
        
      Sepeda sepeda = new Polygon();
      sepeda.setSepeda();
      System.out.println("Sepedaku Beroda "+ sepeda.getRoda());
      sepeda.jenisSepeda();
      System.out.println(sepeda.isMaintenace());
      System.out.println();
      System.out.println(sepeda.isBig());
    }
    
}
