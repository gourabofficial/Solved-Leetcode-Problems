/* Input:
arr = [10, 5, 2, 7, 1, 9]
k = 15

Output:
4   // because subarray [5, 2, 7, 1] has sum 15 and length 4

*/

public class longestSubarray {
    public static void main(String[] args) {
       int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("Longest Subarray Length = " + maxLen);
    }
}
