package day3;
//Write a program to join two array lists into one

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JoinLists {

    public static void main(String[] args){
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Monday");
        arrayList1.add("Tuesday");
        arrayList1.add("Wednesday");
        arrayList1.add("Thrusday");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Friday");
        arrayList2.add("Saturday");
        arrayList2.add("Sunday");

        ArrayList<String> joinedlist = new ArrayList<>();
        joinedlist.addAll(arrayList1);
        joinedlist.addAll(arrayList2);

        System.out.println("Elements after joinin two lists: "+joinedlist);
    }
}
