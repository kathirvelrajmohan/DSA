package LinearSearch;

import java.util.Arrays;

public class DimensionalArray {
    public static void main(String args[]){

//        int[][] arr = new int[3][];
        int[][] arr = {
                {66,4,55,5,2,1,101},
                {5,4,2,45,2},
                {35,85,22,55}};
        for (int[] ints : arr) {
            for (int element : ints) {
                System.out.print(element + " ");
            }
            System.out.println(" ");
        }
        System.out.println(Arrays.toString(searchArray(arr, 45)));
        System.out.println(Maximum(arr));
    }
    static int[] searchArray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Maximum(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints:arr) {
            for(int element : ints){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
}
