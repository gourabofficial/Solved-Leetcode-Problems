
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> myList = new LinkedList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println("Before Reverse : " + myList);

        Collections.reverse(myList);
        System.out.println("After Reverse: " +myList);


       System.out.println("Size of the LinkedList: " +myList.size());
    }
}
