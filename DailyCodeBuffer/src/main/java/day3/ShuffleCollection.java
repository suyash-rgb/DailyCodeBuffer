package day3;
//Write a program to shuffle all the elements of a collection

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCollection {

    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thrusday");
        arrayList.add("Friday");
        arrayList.add("Saturday");
        arrayList.add("Sunday");

        Collections.shuffle(arrayList);

        System.out.println("The Shuffled array list is: "+arrayList);


    }
}
