import java.util.*;

public class UniquePath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replaceAll("[^0-9 ]", " ").trim();

        String[] a = s.split("\\s+");

        int m = Integer.parseInt(a[0]);
        int n = Integer.parseInt(a[1]);

        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                dp[j] = dp[j] + dp[j - 1];

        System.out.println(dp[n - 1]);
    }
}