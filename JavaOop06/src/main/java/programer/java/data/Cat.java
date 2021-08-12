package programer.java.data;

/*
Dalam turunan dibawah ini akan terjadi error karena dalam class animal
di set abstrack sehingga untuk membuatnya bisa merubah class turunanya ini
menjadi abstrack juga bisa membuat kembali method abstrack di class cat seperti
contoh dibawah ini 
*/
public class Cat extends Animal{
    
    public void run(){
        System.out.println("HI this is "+ name +" run cat");
    }
}
