
class binarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15, 17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49};
        int target_item = 43;
        int result = binarySearching(arr, target_item);

        if (result != -1) {
            System.out.println("element in index of : " + result);
        } else {
            System.out.println("element not found..");
        }
    }

    public static int binarySearching(int[] a, int target) {
        int step = 0;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            step++;
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                System.out.println("Total steps: " + step);
                return mid;

            } else if (a[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }

        return -1;

    }
}
