package day7.arrays;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {0,0,3},{1,1,2},{1,0,0}
        };
        int zerocount=0,nonzerocount=0;
        int m=matrix.length;
        int n=matrix[0].length;
        //Traversing the matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0){
                    zerocount++;
                }
                else {
                    nonzerocount++;
                }
            }
        }
        if(zerocount>nonzerocount){
            System.out.println("It is a sparse matrix");
        }
        else {
            System.out.println("It is not a sparse matrix ");
        }
    }
}
