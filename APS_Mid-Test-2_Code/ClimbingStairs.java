import java.util.*;

class ClimbingStairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.replaceAll("[^0-9]","");

        int n = Integer.parseInt(s);

        if(n <= 2){
            System.out.println(n);
            return;
        }
        
        int a = 1, b = 2, c = 0;

        for(int i=3; i<n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}