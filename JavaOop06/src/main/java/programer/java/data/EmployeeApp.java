package programer.java.data;

public class EmployeeApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Aguti ", 2020);
        employee.getEmployee("Budi");
        System.out.println(employee.name);
        System.out.println(employee.umur);
    }
}
