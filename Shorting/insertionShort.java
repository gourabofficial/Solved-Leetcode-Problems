public class insertionShort {
    public static void main(String[] args) {
        int[] arr = {20, 13, 10, 4, 2, 46, 8};
        int size = arr.length;

        System.out.print("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < size; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }

        System.out.println();
        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
