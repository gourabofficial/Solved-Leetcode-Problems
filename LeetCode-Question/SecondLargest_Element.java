/* Given an array of integers nums, return the value of the Second largest element in the array
   Examples:
   Input: nums = [3, 3, 6, 1]

   Output: 3

   Explanation: The lSecond argest element in array is 3
*/

public class SecondLargest_Element {

    public static void main(String[] args) {
        int nums[] = { 3, 3,5,9, 6, 1 };
        find_secondLargestElement(nums);
    }

    public static void find_secondLargestElement(int nums[]) {
        int largest = nums[0];
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                second_largest = largest;
                largest = nums[i];
            } else if (nums[i] > second_largest && nums[i] < largest) {
                second_largest = nums[i];
            }

        }

        System.out.println("Second Largest Element id: " + second_largest);
        System.out.println("Largest element: " + largest);
    }
}
