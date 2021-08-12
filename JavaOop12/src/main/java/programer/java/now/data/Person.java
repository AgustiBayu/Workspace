package programer.java.now.data;

public enum Person {
    
    MAN("Your male Man"),
    WOMAN("Your male woman");
    
    private String gender;
    
    //tidak dapat diset public karna enum tidak bisa diakses melainkan
    //langsung menampilkan 
    Person(String gender){
    this.gender = gender;
}
    
    public String getGender(){
        return gender;
    }
}
