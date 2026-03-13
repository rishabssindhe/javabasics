package day8;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String args[]){
        int[] a={1,3,4,7,8};
        int[] b={2,5,6};
        int[] sorted=mergeTwoSortedArrays(a,b);
        System.out.println(Arrays.toString(sorted));
    }
    public static int[] mergeTwoSortedArrays(int[] a,int[] b){
        int n1=a.length;
        int n2=b.length;
        int[] sorted=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                sorted[k++]=a[i++];
            }
            else{
                sorted[k++]=b[j++];
            }
        }
        while(i<n1){
            sorted[k++]=a[i++];
        }
        while(j<n2){
            sorted[k++]=b[j++];
        }
        return sorted;
    }
}
