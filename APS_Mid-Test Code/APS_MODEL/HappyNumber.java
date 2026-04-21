import java.util.Scanner;

class HappyNumber{
    public boolean Happy(int n){
        while(n !=1 && n !=4){
            int sum = 0;

            while(n>0){
                int d = n % 10;
                sum += d*d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(new HappyNumber().Happy(n));
    }
}