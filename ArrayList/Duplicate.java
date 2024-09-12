// Write a Java program that removes duplicate elements from an ArrayList of integers.
/* 
Input: [1, 2, 3, 2, 4, 5, 3]
Output: [1, 2, 3, 4, 5] 
*/
import java.util.HashSet;
import java.util.Set;


public class Duplicate {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(5);

        System.out.println(set); // set will automatically remove duplicates
    }
}
