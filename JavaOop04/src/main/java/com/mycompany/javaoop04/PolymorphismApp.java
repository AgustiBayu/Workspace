package com.mycompany.javaoop04;


public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Bayu");
        employee.getName("Agusti");
        
        employee = new Manager("Bayu");
        employee.getName("Agusti");
        
        employee = new VicePresident("Bayu");
        employee.getName("Agusti");
        System.out.println("");
      
        //Souce code dibawah ini merupakan cara memunculkan method polymorphism 
        getName(new Employee("Agusti"));
        getName(new Manager("Reka"));
        getName(new VicePresident("Bima"));
    }
    /*
    Source code dibawah ini merupakan sebuah method polymorphism 
    dengan menggunakan method ini progremer tidak perlu mengisi field
    dengan berulang-ulang, perlu diingat method polymorphism ini dimulai atau
    diawali dari method induk terlebih dahulu lalu bisa ke class turunan
    */
    
    static void getName(Employee employee){
        System.out.println("Hello "+ employee.name);
    }
}
