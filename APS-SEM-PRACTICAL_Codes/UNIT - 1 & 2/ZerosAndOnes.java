import java.util.*;

public class ZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int m = sc.nextInt(), n = sc.nextInt();
        
        int[][] dp = new int[m+1][n+1];
        
        for (String s : strs) {
            int z = (int)s.chars().filter(c -> c == '0').count();
            int o = s.length() - z;
            for (int i = m; i >= z; i--)
                for (int j = n; j >= o; j--)
                    dp[i][j] = Math.max(dp[i][j], dp[i-z][j-o] + 1);
        }
        
        System.out.println(dp[m][n]);
    }
}