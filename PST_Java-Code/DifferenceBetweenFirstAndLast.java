import java.util.*;
import java.util.Scanner;

class DifferenceBetweenFirstAndLast{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = s.nextInt(), last = first;

        for(int i=0; i<n; i++)
            last = s.nextInt();

        System.out.print(first-last);
    }
}