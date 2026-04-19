import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class DateTime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        LocalDate d1 = LocalDate.parse(s.nextLine());
        LocalDate d2 = LocalDate.parse(s.nextLine());

        long days = ChronoUnit.DAYS.between(d1,d2)-1;
        if(days<0) days = 0;
        System.out.print(days + "days");
    }
}