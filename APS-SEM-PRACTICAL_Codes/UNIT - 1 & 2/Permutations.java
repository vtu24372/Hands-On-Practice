import java.util.*;

public class Permutations{

    static void p(int[] a, int i) {
        if (i == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }

        for (int j = i; j < a.length; j++) {
            int t = a[i]; a[i] = a[j]; a[j] = t;

            p(a, i + 1);

            t = a[i]; a[i] = a[j]; a[j] = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        p(a, 0);
    }
}