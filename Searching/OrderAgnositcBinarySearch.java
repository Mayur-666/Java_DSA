package Searching;

public class OrderAgnositcBinarySearch {
    public static void main(String[] args) {
        int[] arrayAsc = { 1,2,4,5,6,7,9,12,13,16,18,22}; //sorted in ascending order
        int[] arrayDesc = {33,31,25,21,19,17,12,8,6,5,4,2,1,0}; //sorted in descending order

        int target = 2;

        int ansAsc = binarySearch(arrayAsc, target);
        int ansDesc = binarySearch(arrayDesc, target);

        System.out.println( target + (ansAsc==-1 ? " not found in array." : (" found at index " + ansAsc +".")));
        System.out.println(target + (ansDesc==-1 ? " not found in array." : (" found at index " + ansDesc+".")));

    }
    public static int binarySearch(int[] arr, int target){
        int start = 0, end= arr.length -1;

        if(arr == null || arr.length==0){
            return -1;
        }

        if(arr[start]<arr[end]){
            while (start<=end) {
                int mid = start + (end-start)/2;
                if(arr[mid]==target){
                    return mid;
                } else if (arr[mid]<target){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        } else{
            while (start<=end) {
                int mid = start + (end-start)/2;
                if(arr[mid]==target){
                    return mid;
                } else if (arr[mid]<target){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
