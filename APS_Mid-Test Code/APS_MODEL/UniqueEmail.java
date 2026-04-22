import java.util.*;

class UniqueEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] p = s.split("@");
            String a = p[0].split("\\+")[0].replace(".", "");
            set.add(a + "@" + p[1]);
        }

        System.out.print(set.size());
    }
}