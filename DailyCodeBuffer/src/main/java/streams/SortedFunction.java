package streams;
//sorting using sorted() method

import java.util.List;
import java.util.stream.Collectors;

public class SortedFunction {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,4,2,5,7,4);
        List newnumbers = numbers.stream()
                .map(i-> i*i) //lambda function
                .collect(Collectors.toList());
        System.out.println(newnumbers);

        numbers.stream().sorted().forEach(System.out::println);
        newnumbers.stream().sorted().forEach(System.out::println);
    }
}
