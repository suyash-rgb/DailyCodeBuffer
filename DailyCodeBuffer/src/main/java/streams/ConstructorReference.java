package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {

    public static void main(String[] args) {
        //Constructor Reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhones = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(Arrays.asList(mobilePhones));
    }

}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }

}
