import java.util.Scanner;
class ExceptionHandlingForSumOf2Numbers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.print("The sum of 2 inputs is : " +(a+b));
        } 
        catch(Exception e){
            System.out.print("Invalid. Enter a valid inputs");
        }
    }
}