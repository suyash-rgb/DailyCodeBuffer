package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Adam", MALE),
                new Person("Joanne", FEMALE),
                new Person("Matthew", MALE),
                new Person("Alice", FEMALE),
                new Person("Natalie", FEMALE)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }

        List<Person> males = new ArrayList<>();

        for(Person person: people){
            if(MALE.equals(person.gender)){
                males.add(person);
            }
        }

        for(Person male: males){
            System.out.println(male);
        }
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
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
