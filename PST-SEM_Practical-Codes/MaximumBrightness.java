import java.util.*;

class MaximumBrightness {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int max = Integer.MIN_VALUE, sum = 0;
        int start = 0, l = 0, r = 0;

        for(int i = 0; i < s.length(); i++){
            int val = Character.isLowerCase(s.charAt(i)) 
                      ? s.charAt(i) - 'a' + 1 
                      : -(s.charAt(i) - 'A' + 1);

            if(sum + val < val){
                sum = val;
                start = i;
            } else {
                sum += val;
            }

            if(sum > max){
                max = sum;
                l = start;
                r = i;
            }
        }

        System.out.println(max);
        System.out.println(s.substring(l, r + 1));
    }
}