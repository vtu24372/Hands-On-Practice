import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] n = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> r = new ArrayList<>();
        for (int m = 0; m < (1 << n.length); m++) {
            List<Integer> s = new ArrayList<>();
            for (int i = 0; i < n.length; i++) if ((m & (1 << i)) != 0) s.add(n[i]);
            r.add(s);
        }
        System.out.println(r);
    }
}