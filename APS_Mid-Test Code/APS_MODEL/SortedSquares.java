import java.util.Scanner;
import java.util.*;

class SortedSquares{
    public int[] squares(int[] nums){

        for(int i=0; i<nums.length; i++)
            nums[i] = nums[i] * nums[i];

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++)
            nums[i] = s.nextInt();

        System.out.print(Arrays.toString(new SortedSquares().squares(nums)));
    }
}