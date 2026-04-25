import java.util.*;
import java.util.Scanner;

class SumOfQuantity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        while(true){
            String s = sc.nextLine();
            if(s.equals("done")) break;

            if(!s.contains(":") || s.indexOf(":") != s.lastIndexOf(":")){
                System.out.print("Invalid format");
                return;
            }
            String[] p = s.split(":");

            try{
                sum += Double.parseDouble(p[1]);
            } catch(Exception e){
                System.out.print("Invalid input");
                return;
            }
        }
        System.out.printf("%.2f",sum);
    }
}