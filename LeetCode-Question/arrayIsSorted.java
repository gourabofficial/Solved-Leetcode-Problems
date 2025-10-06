public class arrayIsSorted {
    public static void main(String[] args) {
        int arr[] = { 1,100, 2, 3, 4, 2, 3, 7, 54, 9, 1 };
        // int arr[] ={1,2,3,4,5,6,7};
        boolean result = isSorted(arr);
        if (result) {
            System.out.println("yes the array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

    }

    public static boolean isSorted(int arr[]) {

        for(int i=1; i<arr.length;i++){
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }
}
