package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static declarative.Main.Gender.FEMALE;
import static declarative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<declarative.Main.Person> people = List.of(
                new declarative.Main.Person("John", MALE),
                new declarative.Main.Person("Adam", MALE),
                new declarative.Main.Person("Joanne", FEMALE),
                new declarative.Main.Person("Matthew", MALE),
                new declarative.Main.Person("Alice", FEMALE),
                new declarative.Main.Person("Natalie", FEMALE)
        );

        //Imperative approach
        List<declarative.Main.Person> females = new ArrayList<>();

        for(declarative.Main.Person person: people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(declarative.Main.Person female: females){
            System.out.println(female);
        }

        people.stream().
                filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final declarative.Main.Gender gender;

        Person(String name, declarative.Main.Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }

}
