
import java.util.HashSet;
import java.util.Iterator;


public class FirstExample {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);

        //Iterator

        Iterator <Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // set.remove(4);

        // if(set.contains(10)){
        //     System.out.println("Yes 10 is present");
        // }else{
        //     System.out.println("No 10 is not present");
        // }


        // System.out.println(set);
        // System.out.println(set.size());


    }

}
