
import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int arr[] = {4,26,1,3,87,20 };
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int target = 26;
        int result = binary_search(arr, target);

        if (result != -1) {
            System.out.println("Find the Element! , at index of : " + result);
        } else {
            System.out.println("Not found the Element ");
        }
    }

    static int binary_search(int arr[], int target) {

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                rightIndex = mid - 1;

            } else {
                leftIndex = mid + 1;

            }
        }
        return -1;

    }
}
