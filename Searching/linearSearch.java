
import java.util.Scanner;

class linearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 48, 9, 0, 10};

        System.out.print("Enter the element you search in this array: ");
        int element = input.nextInt();

        int result = searching(arr, element);

        if (result == -1) {
            System.out.println("Element not found int he array");
        } else {
            System.out.println("the element is : " + element);
        }

        System.out.println("the target element index is: " + result);
        input.close();
    }

    public static int searching(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
