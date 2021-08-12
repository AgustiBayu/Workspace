package com.mycompany.javaoop05;

public class ParentApp {
    public static void main(String[] args) {
        
        Turunan turunan = new Turunan();
        turunan.name = "Agusti";
        turunan.doIt();
        System.out.println(turunan.name);
        
        Induk induk = (Induk) turunan;
        induk.name = "Reka";
        induk.doIt();
        System.out.println(induk.name);
    }
    
}
