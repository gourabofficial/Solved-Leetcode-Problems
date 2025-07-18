

public class CircularQueue {
    public static void main(String[] args) {
        queue myQueue = new queue(6);

        myQueue.addInQueue(1);
        myQueue.addInQueue(2);
        myQueue.addInQueue(3);
        myQueue.addInQueue(4);

        //print the elements in the queue
        System.out.println("Elements in the queue:");
        if (!myQueue.isEmpty()) {
            int i = myQueue.front;
            while (true) {
                System.out.print(myQueue.arr[i] + " ");
                if (i == myQueue.rear) break;
                i = (i + 1) % myQueue.size;
            }
        }
        System.out.println();

    }

    static class queue {
        int arr[];
        int front;
        int rear;
        int size;

        // constructor
        queue(int size) {
            this.size = size;
            this.front = -1;
            this.rear = -1;
            this.arr = new int[size];
        }

        // add element
        public void addInQueue(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front == -1) {
                // First element
                front = 0;
                rear = 0;
            } else {
                rear = (rear+1)%size;
            }
            arr[rear] = data;
        }
        //delete element
        public void delete(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if(front == rear){
                // Only one element was present
                front = -1;
                rear = -1;
            }else{
                front = (front+1) % size;
            }
        }


        // isEmpty
        public boolean isEmpty(){
            return (front == -1 && rear == -1);
        }

        //isfull
        public boolean isFull(){
            if(((rear+1)  % size) == front){
                return true;
            }
            return false;
        }
    }
}