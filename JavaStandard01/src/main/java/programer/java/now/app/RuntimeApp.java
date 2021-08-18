package programer.java.now.app;


public class RuntimeApp {
    public static void main(String[] args) {
        
        // membuat default objek runtime java
        Runtime runtime = Runtime.getRuntime();
        
        // mendapatkan jumlah core cpu
        System.out.println(runtime.availableProcessors());
        // mendapatkan jumlah memory bebas di dalam jvm
        System.out.println(runtime.freeMemory());
        // mendapatkan jumlah maksimum memory dalam jvm
        System.out.println(runtime.maxMemory());
        // mendapatkan jumlah total memory dalam jvm
        System.out.println(runtime.totalMemory());
        
    }
    
}
