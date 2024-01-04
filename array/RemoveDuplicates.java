package array;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int[] arr= {0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4};
        int end = removeDuplicates(arr);

        System.out.print("[ ");
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    public static int removeDuplicates(int[] nums) {
        int count=1, oldIndex=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[oldIndex]){
                count++; oldIndex++;
                nums[oldIndex] = nums[i];
            }
        }
        return count;
    }
}