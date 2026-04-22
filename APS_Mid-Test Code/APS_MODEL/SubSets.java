import java.util.*;

class SubSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int x : a)
            for (int i = 0, size = res.size(); i < size; i++) {
                List<Integer> t = new ArrayList<>(res.get(i));
                t.add(x);
                res.add(t);
            }

        System.out.print(res);
    }
}