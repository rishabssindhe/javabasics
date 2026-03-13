package day7.arrays;

public class RecursiveBinary {
    public static int recursiveBin(int[] arr,int key,int s,int e){
        if(s>e) return -1;
        int mid =s + (e-s)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]<key) return recursiveBin(arr,key,mid+1,e);
        else return recursiveBin(arr,key,s,mid-1);
    }

    public static void main(String[] args) {
        int[] arr={2,5,6,42,52};
        int key=42;
        int result=recursiveBin(arr,key,0,arr.length);
        System.out.println(result);
    }
}
