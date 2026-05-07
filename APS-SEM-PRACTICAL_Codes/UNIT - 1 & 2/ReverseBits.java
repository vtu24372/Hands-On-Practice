import java.util.*;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;           // Shift left to make space
            result |= (n & 1);      // Add the last bit of n
            n >>= 1;                // Shift n right to get next bit
        }
        
        System.out.println(result);
    }
}