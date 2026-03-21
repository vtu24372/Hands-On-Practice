import java.util.*;

class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = s.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("The value is found: " + target + " at index " + index);
        } else {
            System.out.println("The value not found");
        }
    }
}