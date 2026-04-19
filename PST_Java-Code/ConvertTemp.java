import java.util.*;

class ConvertTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        String a = sc.next().toUpperCase();
        String b = sc.next().toUpperCase();

        double c = a.equals("C") ? v : a.equals("F") ? (v - 32) * 5 / 9 : v - 273.15;
        double ans = b.equals("C") ? c : b.equals("F") ? c * 9 / 5 + 32 : c + 273.15;

        System.out.printf("%.2f", ans);
    }
}