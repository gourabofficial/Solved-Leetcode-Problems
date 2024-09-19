
class binarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,  6, 57, };
        int target = 6;
        int result = binarySearching(arr, target);
        System.out.println("the target element index is: " + result);
    }

    public static int binarySearching(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                }
            }
            return -1;
        }
    }

