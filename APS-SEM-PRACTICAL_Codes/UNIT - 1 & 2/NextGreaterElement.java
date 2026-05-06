import java.util.*;

class NextGreaterElement{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int[] nums1 = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int[] nums2 = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        for(int i=0; i < nums1.length; i++){
            int ans = -1;
            boolean found = false;

            for(int j=0; j < nums2.length; j++){

                if(found && nums2[j] > nums1[i]){
                    ans = nums2[j];
                    break;
                }
                if(nums2[j] == nums1[i]) 
                    found = true;
            }
            System.out.print(ans +(i < nums1.length -1 ? " " : ""));
        }
    }
}