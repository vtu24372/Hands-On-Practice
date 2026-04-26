import java.util.*;
import java.util.Scanner;

class CalculateOccurence{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String[] arr = s.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String w : arr)
            map.put(w, map.getOrDefault(w,0)+1);

        for(String w : map.keySet())
            System.out.println(w + ":" + map.get(w));
    }
}