
import java.util.HashSet;
import java.util.Set;

/*
Write a Java program to merge two ArrayList objects into a single list and remove duplicates.

Input:

List 1: [1, 3, 5, 7]
List 2: [2, 4, 5, 6, 7]
 */

public class mearge {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);


        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        
        set1.addAll(set2);
       System.out.println("after meargeing: " + set1);


    }
}
