//it meanse the two array there is some value after completed the operation the output is : 1,2,3,4,5,6,10 (// ignore the same value )

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 4 ,10};

        int result = FindUnion(arr1, arr2);
        System.out.println("The union of the two arrays is: " + result);  // (result -> 1,2,3,4,5,6,10)  size -> 7 
    }

    public static int FindUnion(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        // for arr1
        for (int num : arr1) {
            set.add(num);
        }

        // for arr2
        for (int num : arr2) {
            set.add(num);
        }

        return set.size();
    }
}
