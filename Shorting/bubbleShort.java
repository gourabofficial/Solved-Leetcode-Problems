
class bubbleShort {

    public static void main(String[] args) {
        int[] arr = {20, 13, 10, 4, 2, 46, 8};
        int size = arr.length;
        int temp;

        System.out.print("Before shorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(" ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
        System.out.print("After shorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
