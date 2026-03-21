import java.util.Scanner;

class BubbleSort{
    static void bubblesort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            arr[i] = s.nextInt();
        }

        bubblesort(arr);

        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}