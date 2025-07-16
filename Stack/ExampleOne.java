import java.util.Stack;

public class ExampleOne {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();

        //push operation

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        System.out.println(list);
        System.out.println(list.peek());

        //pop operation

         list.pop();
         list.pop();
         
         System.out.println("After Pop operations " + list);


        boolean isEmpty = list.isEmpty();
         if(isEmpty){   
            System.out.println("Yes stack is Empty ");
         }else{
            System.out.println("No , Stack is not Empty ");
         }
    }    
}
