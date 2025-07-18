

public class queueExample {
    public static void main(String[] args) {
        queue myQueue = new queue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        // myQueue.enqueue(6);

        myQueue.dequeue();

        boolean isemptycheck = myQueue.isEmpty();
        if(isemptycheck){
            System.out.println("Queue is Empty..");
        }

        System.out.println("Elements in the queue:");
        for (int i = myQueue.front; i <= myQueue.rear; i++)
            System.out.print(myQueue.arr[i] + " ");
        System.out.println();

    }

    static class queue {
        int arr[];
        int front;
        int rear;
        int size;

        // contructor
        queue(int size) {
            this.size = size;
            this.front = 0;
            this.rear = -1;
            this.arr = new int[size];
        }

        // enqueue operation
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full , you cannot add more elements," + data + " not insert");

            } else {
                rear++;
                arr[rear] = data;

            }
        }

        // dequeue operation
        public void dequeue() {
            if (front > rear) {
                System.out.println("Queue is Empty");
            } else {
                int del = arr[front];
                front++;
                System.out.println("Deleted element is: " + del);
            }
        }

        // is empty

        public  boolean isEmpty() {
            if (rear == -1){

                return true;
            }
                return false;
        }
    }
}
