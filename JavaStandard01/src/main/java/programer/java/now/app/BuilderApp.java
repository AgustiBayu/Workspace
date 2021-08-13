package programer.java.now.app;

/*
sourcecode dibawah ini merupakan sebuah manipulasi string dengan menggunakan
builder string. dengan menggunakan builder ini programer dapat membuat
sebuah manipulasi string nama contohnya seperti dibawah, builder sangat
efektif digunakan dibanding menggunakan string langsung karena dapat menumpuk
dalam file memory
*/

public class BuilderApp {
    public static void main(String[] args) {
        
        //penggunaan string builder dalam main class
        StringBuilder builder = new StringBuilder();
        builder.append("Agusti");//append digunakan untuk memunculkan output
        builder.append(" ");
        builder.append("Bayu");
        builder.append(" ");
        builder.append("Samudro");
        
        //buider harus dikonvert menjadi tostring dan disimpan dalam variable
        String name = builder.toString();
        System.out.println(name);
        
    }
    
}
