
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Rana");
        set.add("Rana");  //ignore the same name .
        set.add("Raja");
        set.add("Buddha");
        set.add("Rahul");

        System.out.print("all name are here: ");

        for (String str : set) {
            System.out.println(str);
        }

    }
}
