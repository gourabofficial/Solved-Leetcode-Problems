
import java.util.LinkedList;

class FirstExample{
    public static void main(String[] args) {
        LinkedList <Integer> myList = new LinkedList<>();
        LinkedList<String> strList = new LinkedList<>();

        myList.add(10);
        myList.add(20);

        System.out.println(myList);

        myList.addFirst(100);
        System.out.println("After Adding: " +myList);

        myList.remove(2);
        System.out.println("Remove the 2 index " +myList);

        myList.remove();
        System.out.println("After Remove " +myList);


        System.out.println(" ");

        strList.add("My");
        strList.add("Name");
        strList.add("is");
        strList.add("Ronaldo");


        for (String str : strList) {
            System.out.print(str + " ");
        }

        System.out.println();
    }
}