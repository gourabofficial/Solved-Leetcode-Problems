
import java.util.HashSet;

// intput -> arr1[] = {1,2,3,4,5,6,7,8,9} ;  
//           arr2[] ={2,3,3,4,4,4,4,4,10};

// commonly in both arrays.

// output: [2,3,4]



public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] ={2,3,3,4,4,4,4,4,10,5};

         FindIntersection(arr1, arr2);

    }   

    public static void FindIntersection(int arr1[], int arr2[]){
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> result = new HashSet<>();

        for (int num : arr1) {
             set.add(num);
        }

        // check intersection

        for (int num : arr2) {
            if(set.contains(num))
            result.add(num);
        }

        //Print the result
        System.out.print("Intersection: ");
        for (int value : result) {
            System.out.println(value);
        }
    }
}
