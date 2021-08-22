package programer.java.now.app;

import java.util.Scanner;

public class ApplikasiTodoList {

    // digunakan untuk daya tampung dalam view application
    public static String[] model = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        viewShowTodoList();
    }

    /*
    3 method dibawah ini merupakan sebuah buissnis logic 
    ====================================================
     */
    // menampilkan todolist 
    public static void showTodoList() {  
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            String todo = model[i]; // menampung result dari model ke varibel todo
            int no = i + 1;

            if (todo != null) {// memfilter jika todo tidak bernilai null maka ditampilkan
                System.out.println(no + ". " + todo);
            }
        }
    }

    // method dibawah ini digunakan untuk test code showTodoList
    public static void testShowTodoList() {
        model[0] = "Belajar java dasar";
        model[1] = "Java itu mudah";
        showTodoList();
    }

    // menambah todolist
    public static void addTodoList(String todo) {
        //cek data apakah penuh atau kosong   #2     
        boolean isFull = true; // sudah penuh
        for (int i = 1; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false; // masih kosong 
                break;
            }
        }

        // jika data penuh maka risize ukuran menjadi 2 kali lipat #3
        if (isFull) {
            String[] temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // calculation script menambah jika jumlah array masih null atau kosong #1
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    // method dibawah ini digunakan untuk test code addTodoList
    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("contoh Todo " + i);
        }
        showTodoList();
    }

    // menghapus todolist
    public static boolean removeTodoList(Integer number) {
        // untuk mengecek apakah data lebih besr dari kapasitas model jika ya maka false
        if ((number - 1) >= model.length) {
            return false;
            // untuk mengecek apakah nilai sebelumnya sudah bernilai null/sudah kosong, jika user inputkan null maka false 
        } else if (model[number - 1] == null) {
            return false;
            /*
                source code dibawah ini merupakan sebuah code yang digunakan untuk
                menggeser angka dekrement 
             */
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {// mengecek apakah i sama dengan data jika ya maka default null
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];// jika tidak maka i + 1/ bergeser
                }
            }
            return true;
        }
    }

    // method dibawah ini digunakan untuk test RemoveTodoList
    public static void testRemoveTodoList() {
        addTodoList("satu"); //addtodolist digunakan untuk menambah output
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        boolean result = removeTodoList(20); //meriset kapasitas model jika benar maka default false
        System.out.println(result);

        result = removeTodoList(7); //cek sourcecode jika user menguhapus > model
        System.out.println(result);

        result = removeTodoList(2);// cek menghapus angka yang sudah dipilih user
        System.out.println(result);

        showTodoList(); // menampilan tampilan dari method 

    }

    // Sourcecode dibawah ini merupakan calculation script sebuah inputan user menggunakan scanner
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();//digunakan untuk membuat sebuah input
        return data;
    }

    // method dibawah ini digunakan untuk test calculation input
    public static void testInput() {
        String name = input("nama");
        System.out.println("Hy " + name);

        String studi = input("chanel");
        System.out.println(studi);
    }

    /*
    3 method dibawah ini merupakan sebuah view dalam application
    ============================================================
     */
    // menampilan view todolist
    public static void viewShowTodoList() {                
        //source code perulang ini akan terus berjalan sampai kondisi terpenuhi
        while (true) {
            showTodoList();//memanggil method showTodoList
            
            System.out.println("MENU");
            System.out.println("1. Menambah");
            System.out.println("2. Menghapus");
            System.out.println("x. Keluar");
                      
            String input = input("Pilih"); // input user
            
            // dalam percabangan percabangan if sebuah tipe data srtring menggunakan equels 
            // berbeda dengan number yang menggunakan keyword logic
            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan anda tidak ada");
            }
        }
    }
    
    public static void testViewTodoList(){
                
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");        
        viewShowTodoList();        
    }

    // menampilkan view menambahkan todolist
    public static void viewAddTodoList() {
        System.out.println("Menambah TodoList");
        
        String todo = input("Todo(jika (x jika batal)");
        if(todo.equals("x")){
            // batal
        }else{
            addTodoList(todo);
        }        
    }
    
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("dua");
        
        viewAddTodoList();        
        showTodoList();
    } 

    // menampikan view menghapus todolist
    public static void viewRemoveTodolist() {
        System.out.println("Menghapus Todolist");

        String number = input("Nomer yang dihapus (jika (x jika batal)");

        if (number.equals("x")) {
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("gagal menghapus " + number);
            }
        }
    }
    
    public static void testViewRemoveTodolist() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        
        showTodoList();
        viewRemoveTodolist();
        showTodoList(); 
    }
}
