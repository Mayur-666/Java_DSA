package Searching;

// can be used only for sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,12,14,18,19,20};
        int target = 19;

        int start = 0, end = arr.length -1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                System.out.println(target +" found at index "+ mid);
                return;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println("Target not found.");
    }
}
