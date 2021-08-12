package programer.java.now.app;

import programer.java.now.data.Company;


public class CompanyApp {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Agusti Bayu Samudro");
        System.out.println(company.getName());
        
        /*
        Dalam membuat objek dari inner class seperti dibawah ini agak
        sedikit berbeda namun dalam inner class. induk harus di implementasikan
        terlebih dahulu setelah karena objek class induk akan dipanggil dalam
        untuk membuat objek inner class
        */        
        Company.Employee employee = company.new Employee();
        employee.setName("Reka Nanda Putri");
        System.out.println(employee.getName());
        
        System.out.println(employee.getCompeny());
    }
    
}
