import java.util.*;
import java.util.Scanner;

class ContainsDuplicated{
    public boolean ContainsNearby(int[] nums, int k){
        
        for(int i=0; i<nums.length; i++)
            for(int j=i+1; j<=i+k && j<nums.length; j++)
                if(nums[i]==nums[j])
                    return true;
                return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.print("Enter the k : ");
        int k = s.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            nums[i] = s.nextInt();
        }

        System.out.print(new ContainsDuplicated().ContainsNearby(nums,k));
    }
}