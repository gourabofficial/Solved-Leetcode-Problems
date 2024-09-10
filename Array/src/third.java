
import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] numsArr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(numsArr));
        change(numsArr);
        System.out.println(Arrays.toString(numsArr));

    }

    public static void change(int []num) {
        num[0] = 7;
    }
}