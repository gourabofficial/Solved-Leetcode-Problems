
import java.util.ArrayList;
import java.util.Collections;

public class ListInterface {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(265);
        num.add(-20);

        System.out.print("Before sorted: ");
        for (Integer i : num) {
            System.out.print(i + " ");
        }

        System.out.println();

        Collections.sort(num);
        System.out.print("After sorted: " );

         for (Integer i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
