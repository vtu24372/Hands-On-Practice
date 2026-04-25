import java.util.*;
import java.util.Scanner;

class UniqueRegisterNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        HashSet<String> seen = new HashSet<>();

        for(int i=0; i<n; i++){
            String line = s.nextLine();
            String reg = line.split(" ")[0];

            if(!seen.contains(reg)){
                seen.add(reg);
                System.out.println(line);
            }
        }
    }
}