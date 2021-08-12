package programer.java.now.anotation;

/*
sourcecode dibawah ini merupakan sebuah anotation atau bisa dipahami 
sebagai metadata sehingga programer dapat menambah informasi dalam sourcecode
yang sedang dibuat
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
    
    String name();
    String[] tags() default {};
    
    
}
