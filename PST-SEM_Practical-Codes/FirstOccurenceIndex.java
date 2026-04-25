import java.util.*;
import java.util.Scanner;

class FirstOccurenceIndex{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();
        String pattern = s.nextLine();

        System.out.println(text.indexOf(pattern));
    }
}