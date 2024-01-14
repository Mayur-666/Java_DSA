package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,2,3,0,7,8,23,22,12,27};

        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("Target found at index " + i);
                return;
            }
        }
        System.out.println("Target not found.");
    }
}
