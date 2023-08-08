package BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args){
        int[] arr = {-33,-22,-17,-11,2,3,4,5,7,8,44,55,78,90};
        int target = 22;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
