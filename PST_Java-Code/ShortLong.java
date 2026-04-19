import java.util.*;
import java.util.Scanner;
import java.util.function.Function;

class ShortLong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Function<String, String> check = x->x.length() <= 3 ? "Short" : "Long";

        String[] word = s.split(" ");
        for(int i=0; i<word.length; i++){
            System.out.print(check.apply(word[i]));
            if(i<word.length-1) System.out.print(" ");
        }
    }
}