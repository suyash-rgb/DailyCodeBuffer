package streams;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        //Method Reference operator -- use method without invoking & in place of a lambda expression
        List<String> students =Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x-> System.out.println(x)); //lambda expression
        students.forEach(System.out::println); //giving method as a parameter
    }
}
