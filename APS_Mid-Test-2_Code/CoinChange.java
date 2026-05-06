import java.util.*;

class CoinChange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.replace("[", "")
               .replace("]", "")
               .replace(",", " ");

        s2 = s2.replaceAll("[^0-9]", "");

        String[] a = s1.trim().split("\\s+");

        int[] coin = new int[a.length];

        for (int i = 0; i < a.length; i++)
            coin[i] = Integer.parseInt(a[i]);

        int amount = Integer.parseInt(s2);

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int c : coin) {

                if (c <= i)
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }

        System.out.println(dp[amount] > amount ? -1 : dp[amount]);
    }
}