import java.util.*;

class DailyTemperature{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] t = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        for(int i = 0; i < t.length; i++){
            int days = 0;

            for(int j = i+1; j < t.length; j++){
                if(t[j] > t[i]){
                    days = j - i;
                break;
                }
            }
            System.out.print(days + (i < t.length -1 ? " " : ""));
        }
    }
}