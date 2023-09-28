package ProblemBinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args){
        int[] arr = new int[] {2,5,6,0,0,1,2};
        System.out.println(search(arr,0));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if(pivot == -1){
            return BinarySearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0] <= target){
            return BinarySearch(nums,target,0,pivot-1);
        }

        return BinarySearch(nums,target,pivot+1, nums.length-1);


    }
    static int BinarySearch(int[] arr,int target,int start, int end){
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
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[start]){
                if(arr[start]>arr[start+1]){
                    return start;
                }

                start++;

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
