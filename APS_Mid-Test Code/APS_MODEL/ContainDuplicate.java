import java.util.*;
import java.util.Scanner;

class ContainDuplicate{
    public boolean duplicate(int[] nums, int k){

        for(int i=0; i<nums.length; i++)
            for(int j=i+1; j<=i+k && j<nums.length; j++)

        if(nums[i] == nums[j])
            return true;
        
        return false;
        
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int k = s.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++)
            nums[i] = s.nextInt();

        System.out.print(new ContainDuplicate().duplicate(nums,k));
    }
}