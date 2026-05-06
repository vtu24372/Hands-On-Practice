import java.util.*;

class FinalPrices{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] p = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        for(int i = 0; i < p.length; i++){
            int dis = 0;

            for(int j = i+1; j < p.length; j++){
                if(p[j] <= p[i]) 
                    dis = p[j];
                break;
            }
            System.out.print((p[i] - dis) +(i < p.length-1 ? " " : ""));
        }
    }
}