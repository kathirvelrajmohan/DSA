package ProblemBinarySearch;
//This program returns the index value of greatest smaller number to the target number
public class Floor {
    public static void main(String[] args){
        int[] arr = {-44,-33,-25,-16,9,11,34,56,78,99};
        int target = 45;
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
                if(target>arr[mid]){
                    start+=1;
                }
                else{
                    end-=1;
                }
            }
            else{
                if(target>arr[mid]){
                    end-=1;
                }
                else{
                    start+=1;
                }
            }

        }
        if(isAsc){
            return (end);
        }
        else{
            return (start);
        }
    }
}
