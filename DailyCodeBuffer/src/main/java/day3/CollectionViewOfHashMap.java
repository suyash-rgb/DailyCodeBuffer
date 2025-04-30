package day3;
// Write a program to get the collection view of the values present in a HashMap

import java.util.HashMap;

public class CollectionViewOfHashMap {

    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("1", "Monday");
        hashMap.put("2", "Monday");
        hashMap.put("3", "Monday");
        hashMap.put("4", "Monday");
        hashMap.put("5", "Monday");
        hashMap.put("6", "Monday");
        hashMap.put("7", "Monday");

        System.out.println("Original HashMap: "+hashMap);
        System.out.println("Collection view of HashMap: "+hashMap.values());
    }
}
