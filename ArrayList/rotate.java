/*
 * Write a function that rotates the elements of an ArrayList by a given number of positions. For example, if the ArrayList is rotated by 2 positions, the elements should shift right by 2 places.

Input:

ArrayList: [10, 20, 30, 40, 50]
Rotate by: 2
Output: [40, 50, 10, 20, 30]

 */
import java.util.ArrayList;
import java.util.Collections;
public class rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int rotateBy = 2;
        System.out.println("Before rotation: " + list);

        Collections.rotate(list, rotateBy);
        
        System.out.println("After rotation: " + list);

    }
}
