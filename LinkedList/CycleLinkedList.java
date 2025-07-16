class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleLinkedList {
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }
     ListNode fast = head;
     ListNode slow = head;

     while(fast != null && fast.next !=null){
        fast = fast.next.next;
        slow = slow.next;

        if(fast == slow){
            return true;
        }
     }   
     return false; // Added missing semicolon
    }

    // Optional: Main method for testing
    public static void main(String[] args) {
        CycleLinkedList solution = new CycleLinkedList();
        
        // Test case 1: No cycle
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        
        System.out.println("Has cycle: " + solution.hasCycle(head1)); // false
        
        // Test case 2: With cycle
        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(0);
        head2.next.next.next = new ListNode(-4);
        head2.next.next.next.next = head2.next; // Creates cycle
        
        System.out.println("Has cycle: " + solution.hasCycle(head2)); // true
    }
}