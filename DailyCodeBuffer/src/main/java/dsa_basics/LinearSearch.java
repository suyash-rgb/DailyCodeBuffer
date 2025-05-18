package dsa_basics;

public class LinearSearch {
    public static int LinearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,12,15,30};
        int key=12;
        int result = LinearSearch(numbers, key);
        if(result!=1){
            System.out.println("Element found at index: "+result);
        } else {
            System.out.println("Not found");
        }
    }

}
