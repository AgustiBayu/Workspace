package com.mycompany.belajarjava08;


public class PerulanganJava {
    public static void main(String[] args) {
        
        //Source code dibawah ini merupakan perulangan for
        //yang berada dalam java
        for (byte data1 = 1; data1 <= 10; data1++){
            
            System.out.println("Perulangan For ke- "+data1);
        }
        
        {
            System.out.println("");
            byte data2 = 1;
            
            //Source code dibawah ini merupakan perulangan while
            //yang berada dalam bahasa java
            while (data2 <= 10){
                System.out.println("Perulangan While ke- "+data2);
                data2++;
            }
        }
        
            {
                System.out.println("");
                byte data3 = 1;
                
                //Source code dibawah ini merupakan sebuah perulang 
                //do while yang berada dalam java
                do{
                    System.out.println("Perulangan doWhile ke -"+data3);
                    data3++;
                }while(data3 <= 10);
            }
            /*
            Source code diatas digunakan untuk memunculkan sebuah array menggunakan 
            sebuah perulangan for dengan contoh seperti dibawah ini 
            */
            {
                System.out.println();
                String[] name = new String[]{
                     "Agusti", "Bayu", "Samudro",
                      "Reka", "Nanda", "Putri",
                      "Bima", "Cahya", "Prayoga"
                };
                    for (byte nilai = 0; nilai < name.length; nilai++ ){
                        System.out.println(name[nilai]);
                    }
                    
                    //atau cara simplenya seperti ini tergantung dengan programer
                    // cara ini dikenal sebagai for each dengan hasil sama saja 
                    //seperti diatas namun lebih mudah dan pendek
                    System.out.println("");
                    for (String test : name){
                        System.out.println(test);
                    }
            }
    }
    
}
