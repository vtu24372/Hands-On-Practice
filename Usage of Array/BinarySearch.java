import java.util.*;

class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        
        Arrays.sort(arr);

        System.out.print("Enter the target: ");
        int target = s.nextInt();

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("The value is found: " + target + " at index " + index);
        } else {
            System.out.println("The value not found");
        }
    }
}