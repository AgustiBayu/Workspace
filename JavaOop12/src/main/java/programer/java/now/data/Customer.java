package programer.java.now.data;


public class Customer {
    
    private String name;
    
    /*
    sourcecode dibawah ini merupakan cara memanggil class enum yang sudah
    di implementasi sehingga hanya memanggil nama class nya setelah itu nama
    objeknya
    */
    private Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //cara menggunakan method geter dalam class emun
    public Level getLevel() {
        return level;
    }
    //cara menggunakan method seter dalam class enum
    public void setLevel(Level level) {
        this.level = level;
    }
    
}
