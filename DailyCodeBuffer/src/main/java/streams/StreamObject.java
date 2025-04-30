package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Ways to create a Stream Object
public class StreamObject {
    public static void main(String[] args) {
        //Stream API - processes collection and group of Objects(Arrays)

        //1 blank stream using empty() method
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e));
        //blank output upto this

        //2 Using  Stream.of() method()
        String names[] = {"Suyash", "Uttam", "Ankit"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(System.out::println);

        //3 Using Builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        //4 using stream() method
        IntStream stream = Arrays.stream(new int[]{1,3,4,5,557,76,7});
        stream.forEach(System.out::println);

        //5

    }
}
