package day8.binarysearchappln;

public class SqaureRootBin {
    public static int sqrtb(int n){
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            }else if(square>n){
                e=mid-1; // go to the left hand side
            } else{
                // store the probable answer and save in the right
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrtb(37));
    }
}
