import java.util.*;
import java.util.Scanner;

class SortedSquares{
    public int[] SumOfSortedSquares(int[] nums){
        
        for(int i=0; i<nums.length; i++)
            nums[i] = nums[i] * nums[i];
            
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            nums[i] = s.nextInt();
        }
        System.out.print(Arrays.toString(new SortedSquares().SumOfSortedSquares(nums)));
    }
}