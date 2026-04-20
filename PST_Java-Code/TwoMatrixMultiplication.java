import java.util.*;

class TwoDMatrixMultiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();

        int m1 = (a + d) * (a + d);
        int m2 = (c + d) * a;
        int m3 = a * (b - d);
        int m4 = d * (c - a);
        int m5 = (a + b) * d;
        int m6 = (c - a) * (a + b);
        int m7 = (b - d) * (c + d);

        int x = m1 + m4 - m5 + m7;
        int y = m3 + m5;
        int z = m2 + m4;
        int w = m1 - m2 + m3 + m6;

        System.out.println((x - 9 * a) + " " + (y - 9 * b));
        System.out.println((z - 9 * c) + " " + (w - 9 * d));
    }
}