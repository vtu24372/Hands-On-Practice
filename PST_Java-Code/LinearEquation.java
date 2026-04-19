import java.util.*;
class LinearEquation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if(a==0) System.out.print("a is zero");
        else System.out.printf("x = %.1f\n",(c-b)/a);

        if(b==0) System.out.print("b is zero");
        else System.out.printf("y = %.1f",(c-a)/b);
    }
}