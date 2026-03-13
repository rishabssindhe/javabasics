package day7.arrays;

import java.util.Arrays;

public class Countingsort {
    public static void countSort(int[] arr){
        int k=arr[0];
        //find max element
        for(int i=1;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }
        //step 2 create a count array [0 - max]
        int[] count=new int[k+1];
        //step 3 calculate the freq of each element in th array
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        //step 4  calc the cumulative freq
        //skip index[0] and start from 1 till max
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }
        //step 5 Create the output array
        int[] output=new int[arr.length];
        //step 6  start from the end of the array(L-- R)
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }
        //copy the output to the input
        System.arraycopy(output,0,arr,0,arr.length);


    }

    public static void main(String[] args) {
        int[] arr={2,4,3,2,1,7,2};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
