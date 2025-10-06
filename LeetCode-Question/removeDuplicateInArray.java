
import java.util.HashSet;
import java.util.Set;

/* Remove Duplicates from Sorted Array  */

public class removeDuplicateInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 1, 1, 3, 4, 6, 7, 7, 7, 5 };
        Set<Integer> myset = new HashSet<>();
        for (int nums : arr) {
            myset.add(nums);
        }
        System.out.println("Array without duplicate Element :  " +myset);
    }
}
