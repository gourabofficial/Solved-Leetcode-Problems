/* Input:
arr = [10, 5, 2, 7, 1, 9]
k = 15

Output:
4   // because subarray [5, 2, 7, 1] has sum 15 and length 4

*/

public class longestSubarray {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        int result = findTheSubArraySum(arr, k);
        System.out.println(result);

    }

    public static int findTheSubArraySum(int arr[], int k) {
        int max_length = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) { 
                    max_length = Math.max(max_length, j - i + 1);  // i = 5 (first index), j = 1 (last index)
                }                                                 // subarray = [5,2,7,1] length= 4-1+1=4
            }
        }
        return max_length;
    }
}
