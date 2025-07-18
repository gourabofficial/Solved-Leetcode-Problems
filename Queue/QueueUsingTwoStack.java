
import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println( "delete: " + q.delete());
        q.enqueue(5);

       

    }

    public static  class myQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // add first
        void enqueue(int data) {
            s1.push(data);
            System.out.println(data + " Added Succesfully");
        }

        // remove
        public int delete() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

    }
}
