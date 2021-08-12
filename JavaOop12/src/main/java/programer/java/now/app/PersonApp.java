package programer.java.now.app;

import programer.java.now.data.Gender;
import programer.java.now.data.Person;


public class PersonApp {
    public static void main(String[] args) {
        
        Gender gender = new Gender();
        gender.setName("Agusti Bayu Samudro");
        gender.setPerson(Person.MAN);
        
        System.out.println(gender.getName());
        System.out.println(gender.getPerson());
        System.out.println(gender.getPerson().getGender());
        
        gender.setName("Reka Nanda Putri");
        gender.setPerson(Person.WOMAN);
        
        System.out.println(gender.getName());
        System.out.println(gender.getPerson());
        System.out.println(gender.getPerson().getGender());
        System.out.println("");
        
        System.out.println("Print gender");
        String outGender = Person.MAN.name();
        System.out.println(outGender);
        System.out.println("");
        
        Person person = Person.valueOf("WOMAN");
        System.out.println(person);
        System.out.println("");
        
        //Sourcecode memunculkan semua enum class
        for(Person value : Person.values()){
            System.out.println(value);
        }
    }
    
}
