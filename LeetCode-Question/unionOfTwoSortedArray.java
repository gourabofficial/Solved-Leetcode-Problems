/*union of two sorted array 
int arr[] ={1,2,3,4,5,6,7};
int arr2[]={2,4,4,5,6,7,8,9,}

output-> 1,2,3,4,5,6,7,8,9

*/

import java.util.*;

public class unionOfTwoSortedArray {
 public static void main(String[] args) {
    int arr[] ={1,2,4,5,6,7,8,9};
    int arr2[]={2,2,2,3,4,5,6,};

    Set<Integer> set = new HashSet<>();

    for (int nums : arr) {
        set.add(nums);
    }

    for(int nums : arr2){
        set.add(nums);
    }
    List<Integer> union = new ArrayList<>(set);
        Collections.sort(union);

        System.out.println("Union of two sorted array: " +union);
    
 }   
}
