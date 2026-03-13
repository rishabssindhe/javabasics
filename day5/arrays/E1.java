package day5.arrays;

public class E1 {
    public static void main(String[] args) {
        int[] arr1=new int[5];//Memory allocation
        //Declaration Memory allocation(20 bytes)
        // If we dont provide value
        //JvM uses "fallback mechanism"
        //It uses the default value of that data type

        int[] arr3={1,2,3,4,5}; //direct initialization
        int[] arr4=new int[]{1,2,3,4,5,6};
        for(Object o:arr4)System.out.println(o);
        String name="JAVA";
        System.out.println(name.length());
    }
}
//Access and update elements in an array -> TC O(1)
//This is because of index based access or
// direct index mapping
/*
🎶 array.length is a property
string.length() is method
Memory Management
Array Object is stored in the Heap
Variable references is stored in the stack
Elements are stored in contiguous memory blocks
 */