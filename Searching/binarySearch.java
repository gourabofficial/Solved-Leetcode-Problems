
class binarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15, 17};
        int target_item = 13;
        int result = binarySearching(arr, target_item);

        if (result != -1) {
            System.out.println("element in index of : " + result);
        } else {
            System.out.println("element not found..");
        }
    }

    public static int binarySearching(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
