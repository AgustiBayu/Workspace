package programer.java.data;

public class Employee {
    
    public String name;
    public int umur;
    
    public Employee(String name, int umur){
        
        this.name = name;
        this.umur = umur;
    }
    
    public void getEmployee(String name){
        System.out.println("Hi "+ name +"My name is "+ this.name);
    }
}
