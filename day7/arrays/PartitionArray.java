package day7.arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int[] arr={2,6,3,7,4,9};
        int left=0,right=arr.length-1;
        while(left<right)
        {
            while(arr[left]%2==0) left++;
            while(arr[right]%2!=0) right--;
        }
        if(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
