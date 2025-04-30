package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,3,5,6,5,4,74,78,985,5,12);

        List<Integer> newlist = list1.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(newlist);
    }
}
