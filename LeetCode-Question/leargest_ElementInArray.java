/* Given an array of integers nums, return the value of the largest element in the array
   Examples:
   Input: nums = [3, 3, 6, 1]

   Output: 6

   Explanation: The largest element in array is 6
*/
public class leargest_ElementInArray {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        largestElement(nums);

    }

    public static void  largestElement(int[] nums) { 
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest ){
                largest = nums[i];
            }
        }

        System.out.println("Largest element in the array : " +largest);
    }

}
