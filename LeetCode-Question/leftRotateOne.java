
// Left Rotate an array by one place

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leftRotateOne {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        RotateArrayOnePlace(arr);
        // ArrayOnePlace(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RotateArrayOnePlace(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

    }

    public static void ArrayOnePlace(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int num : arr)
            list.add(num);

        Collections.rotate(list, -1);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));

    }
}