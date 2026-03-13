package day5.arrays;

import java.util.Arrays;

public class E4 {
    public static void printArray(int[] arr) {
        for(int num:arr){
            System.out.println(num);
        }
    }
    public static int[] createArray(){
        return new int[] {10,20,30};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
        int[] result =createArray();
        //Anonymous array -> as we dont have a reference / object
        // After the method call, we can never access it
        printArray(new int[]{100, 200, 300});
        System.out.println(Arrays.toString(arr));
    }
}
