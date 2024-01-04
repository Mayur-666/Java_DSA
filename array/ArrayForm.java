package array;
import java.util.ArrayList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9};
        int k = 99;
        System.out.println(arrayFormInt(nums, k));
    }
    
    static List<Integer> arrayFormInt(int[] nums, int k){    
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
        int i=nums.length-1;
        ans.set(i, ans.get(i) + k);
        while(i>-1){
            if ( ans.get(i)>9 ){
                int a = ans.get(i);
                int r = a%10;
                a = a/10;
                ans.set(i, r);
                if( i==0){
                    if(a>9){
                        while(a>0){
                            int r1 = a%10;
                            ans.add(0,r1);
                            a = a/10;
                        }
                    }else{
                        ans.add(0, a);
                    }
                } else{
                    ans.set(i-1, ans.get(i-1) + a);
                }
            }
            i--;
        }
        return ans;
    }
}
