package streams;

import java.util.List;
import java.util.stream.Collectors;

//Program to demonstrate the methods in streams
public class StreamMethods {

    public static void main(String[] args) {

        //1. filter method
        //takes a predicate as input -> filter(Predicate)
        List<String> names = List.of("Abinav", "Abhishek", "Neeraj", "Suyash");
        List<String> startswithA = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(startswithA);

        //2. map method
        //takes a function as input -> map(function)
        List<Integer> numbers = List.of(23,4,2,5,7,4);
        List newnumbers = numbers.stream()
                .map(i-> i*i) //lambda function
                .collect(Collectors.toList());
        System.out.println(newnumbers);

    }
}
