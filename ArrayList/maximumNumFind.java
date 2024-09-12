
import java.util.ArrayList;
import java.util.Collections;

/*
Write a program that finds and prints the maximum element from an ArrayList of integers.

Input: [10, 20, 5, 70, 40]
Output: 70
*/

public class maximumNumFind {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(5);
       list.add(70);
       list.add(40);

      
       int maxNumber = Collections.max(list);
       System.out.println("in this arraylist , Maximum number is: " + maxNumber);
    
   }


}
