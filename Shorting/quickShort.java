
public class quickShort {

    public static void Quickshort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            Quickshort(arr, low, pivot - 1);
            Quickshort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int key = arr[low];
        int i = low;
        int j = low + 1;

        while (j <= high) {
            // If the current element is less than the pivot
            if (arr[j] < key) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        // Place the pivot at its correct position
        arr[low] = arr[i];
        arr[i] = key;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {48, 40, 50, 30, 10, 26, 2};
        System.out.print("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        Quickshort(arr, 0, arr.length - 1);
        System.out.println(" ");

        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
