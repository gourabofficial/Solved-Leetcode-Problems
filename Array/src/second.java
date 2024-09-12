import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int arrsize = in.nextInt();
        int[]arr = new int[arrsize];
        System.out.print("your arr: ");
        for (int i = 0; i < arrsize; i++) {
        arr[i] = in.nextInt();
        }

        System.out.print("Array element are: ");
        for (int i = 0; i <arrsize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
