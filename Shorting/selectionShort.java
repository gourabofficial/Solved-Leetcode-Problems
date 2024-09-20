
public class selectionShort {

    public static void main(String[] args) {
        int[] arr = {20, 13, 10, 4, 2, 46, 8};
        int size = arr.length;
        int temp;

        System.out.print("Before shorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Selection short
        for (int i = 0; i < size-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println(" ");
        System.out.print("After shorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
