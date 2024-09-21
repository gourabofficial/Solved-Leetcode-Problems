
public class insertionShort {

    public static void main(String[] args) {
        int[] arr = {20, 13, 10, 4, 2, 46, 8};
        int size = arr.length;
        int key;

        System.out.print("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < size; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                //shipting

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
        System.out.println();
        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
