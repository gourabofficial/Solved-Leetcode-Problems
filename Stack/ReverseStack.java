import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("Before Reverse : " +list);

        reverse(list);
        System.out.println("After Reverse: " +list);

        

    }

    static void PushAtButtom(Stack<Integer> list, int element) {
        // base case
        if (list.isEmpty()) {
            list.push(element);
            return;
        }

        int top = list.pop();
        PushAtButtom(list, element);
        list.push(top);
    }

    static void reverse(Stack<Integer> list){
        if(list.isEmpty()){
            return;
        }

        int top = list.pop();
        reverse(list);
        PushAtButtom(list, top);

    }
}
