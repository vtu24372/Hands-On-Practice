import java.util.*;

class Comman{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String text = sc.nextLine();
       String pat = sc.nextLine();

       System.out.print(text.indexOf(pat));
    }
}