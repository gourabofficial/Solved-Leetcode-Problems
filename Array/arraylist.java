import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(127);
        list.add(19992);
        list.add(126);
        list.add(1432);
        list.add(142);
        System.out.println(list);

        list.remove(0);
        list.add(0, 99);
        list.clear();
        //after removing the first element and adding 99 at the first index
        System.out.println(list);
    }
}
