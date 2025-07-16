
import java.util.LinkedList;
import java.util.Scanner;

public class NthNodeFromLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth position form last: " );
        int n = sc.nextInt();
        LinkedList <Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        
        int size = list.size();
        

        if(n > size || n <= 0){
            System.out.println("Invalid position you enterd...");
            
        }else{
            int value = list.get(size-n);
            System.out.println("The " + n + "th node from the end is: " + value);
        }
    
    }
}
