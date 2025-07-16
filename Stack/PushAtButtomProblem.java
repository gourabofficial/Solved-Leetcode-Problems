import java.util.Stack;

public class PushAtButtomProblem {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("Atfirst the stack is : " +list);

        PushAtButtom(list, 100);

        System.out.println("After add the Element at the Buttom:  " + list);
        
    }

    static void PushAtButtom(Stack<Integer> list,int element){
        //base case 
        if(list.isEmpty()){
            list.push(element);
            return;
        }

        int top = list.pop();
        PushAtButtom(list, element);
        list.push(top);
    }
}
