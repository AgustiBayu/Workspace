package com.mycompany.javaoop04;

public class Employee {
    
    String name;
    
    /*
    Source code dibawah ini merupakan sebuah induk dari turunan polymorphism
    dalam constructor
    */
    Employee(String name){
        this.name = name;
    }
    void getName(String name){
        System.out.println("Hi, "+ name +"My name is Employee "+ this.name);
    }
}
