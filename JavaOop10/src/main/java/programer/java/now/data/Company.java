package programer.java.now.data;

/*
 sourcecode dibawah ini merupakan sebuah class company yang inner class
 dengan class employee inner class umumnya digunakan didalam class itu
 sendiri
*/
public class Company {
    
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    /*
    Dalam class company / perusahaan ini terdapat sebuah iner clas yaitu
    classs employed / karyawan fungsi atau keguanaan dari inner class ini
    adalah mengoptimalkan programer guna terdapat sebuah class yang saling 
    berkaituan contohnya seperti company dan employee
    */
    
    public class Employee {
        
        private String name;
        
        public String getName(){
            return name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        /*
        Keuntungan membuat inner class ini adalah programer bisa
        memanggil ulang method atau field yang berada dalam outer class
        sehingga tidak perlu membuat objek lagi dalam membuat sebuah class
        */
        public String getCompeny(){
            return Company.this.getName();
        }
        
    }   
}
