package programer.java.now.app;

import programer.java.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        
        Category category = new Category();
        category.setId("2018049");//digunakan untuk mengisi data atau merubah data
        category.getId();//digunakan untuk memanggil data dalam sout
        category.setExpensive(false);//digunakan untuk mengisi data atau merubah data
        category.isExpensive();//digunakan untuk memanggil data dalam sout
        
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
        
    }
    
}
