package day7.arrays;

public class KadaneAlgo {

    public static int kadane(int[] arr){
        int cmax=arr[0],gmax=arr[0];
        for(int i=1;i<arr.length;i++){
            cmax=Math.min(arr[i],(cmax+arr[i]));
            gmax=Math.min(cmax,gmax);
        }
        return gmax;
    }

    public static void main(String[] args) {
        int[] arr={5,-8,1,2,-1,4};
        System.out.println(kadane(arr));
    }
}
