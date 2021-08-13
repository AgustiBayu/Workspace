package programer.java.now.app;


public class BuilderApp {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder();
        builder.append("Agusti");
        builder.append(" ");
        builder.append("Bayu");
        builder.append(" ");
        builder.append("Samudro");
        
        String name = builder.toString();
        System.out.println(name);
        
    }
    
}
