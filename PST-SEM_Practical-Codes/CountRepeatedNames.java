import java.util.*;
import java.util.Scanner;

class CountRepeatedNames{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n  = s.nextInt();
        s.nextLine();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<n; i++)
            list.add(s.nextLine());

        String search = s.nextLine();
        int count = 0;

        for(String name : list)
            if(name.equals(search))
                count++;

        System.out.print(count);
    }
}