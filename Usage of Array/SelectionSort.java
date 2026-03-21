import java.util.Scanner;

class SelectionSort{
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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

        selectionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}