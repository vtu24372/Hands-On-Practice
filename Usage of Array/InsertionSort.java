import java.util.Scanner;

class InsertionSort{
    static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }

            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            arr[i] = s.nextInt();
        }

        insertionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}