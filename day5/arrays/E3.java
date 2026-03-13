package day5.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};//1D
        //2D Array Array of Array Matrix
        int[][] matrix={{1,2,3} /* row 0 */,{4,5,6}/* row 1 */,{7,8,9}/* row 2 */};//2D
        System.out.println(arr.length);
        System.out.println(matrix.length);
        int[][] jagged={
                {1,2,3,4},
                {1,2,3},
                {1,2}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        for(int i=0;i< jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();

        }
        for(int[] a:jagged){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        char[][] hi={
                {'r','i','s','h','a','b'},
                {'s','i','n','d','h','e'}
        };
        for(char[] a:hi){
            for(char x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
/*
In an array if the row length is not same its is called jagged array
 */