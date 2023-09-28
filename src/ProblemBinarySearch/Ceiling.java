package ProblemBinarySearch;
//This program return the index value of smallest greater number target element
public class Ceiling {
    public static void main(String[] args){
        int[] arr = {78,55,43,22,17,15,9,4,-1,-4,-66,-77};
//        int[] arr = {-44,-33,-25,-16,9,11,34,56,78,99};
        int target = 89;
        System.out.println(findings(arr,target));
    }
    static int findings(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target>arr[arr.length-1]){
                    return -1;
                }
                if(target>arr[mid]){
                    start+=1;
                }
                else{
                    end-=1;
                }
            }
            else{
                if(target>arr[0]){
                    return -1;
                }
                if(target>arr[mid]){
                    end-=1;
                }
                else{
                    start+=1;
                }
            }

        }
        if(isAsc){
            return (start);
        }
        else{
            return (end);
        }
    }
}
