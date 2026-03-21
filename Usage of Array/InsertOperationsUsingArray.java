import java.util.Scanner;

class InsertOperationsUsingArray {

    static int[] insertAtBeginning(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = element;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];   // FIXED
        }
        return newArr;
    }

    static int[] insertAtEnd(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;   
        return newArr;
    }

    static int[] insertAtPosition(int[] arr, int element, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {  
            if (i == pos)
                newArr[i] = element;
            else
                newArr[i] = arr[j++];
        }
        return newArr;
    }

    static int[] insertAtMiddle(int[] arr, int element) {
        return insertAtPosition(arr, element, arr.length / 2);  
    }

    static void display(int[] arr) {   
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("1)Beginning 2)End 3)Position 4)Middle");
        int op = s.nextInt();   

        System.out.print("Enter the element to insert: ");
        int element = s.nextInt();

        switch (op) {
            case 1: arr = insertAtBeginning(arr, element); break;
            case 2: arr = insertAtEnd(arr, element); break;
            case 3:
                System.out.print("Enter position: ");
                int pos = s.nextInt();   
                arr = insertAtPosition(arr, element, pos);
                break;
            case 4: arr = insertAtMiddle(arr, element); break;
        }

        System.out.println("Updated Array:");
        display(arr);
    }
}