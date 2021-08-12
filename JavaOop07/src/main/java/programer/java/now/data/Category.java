package programer.java.now.data;


public class Category {
    
    private String id;
    private boolean expensive;
    
    //geter digunakan untuk memunculkan data dalam main
    public String getId(){
        return id;
    }
    
    //seter digunakan untuk mengubah data dalam main
    public void setId(String id){
        this.id = id;
    }
    
    //geter digunakan untuk memunculkan data dalam main
    public boolean isExpensive(){
        return expensive;
    }
    
    //seter digunakan untuk mengubah data dalam main
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
}
