import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravarsal {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertData(8);
        tree.insertData(7);
        tree.insertData(12);
        tree.insertData(15);
        tree.insertData(2);
        tree.insertData(5);

        // tree.levelorder(BinaryTree.root);
        tree.levelordertravarsal();
    }

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // BinaryTree class
    public static class BinaryTree {
        static Node root;

        public static void insertData(int data) {
            root = insertRec(root, data);
        }

        private static Node insertRec(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        public void levelordertravarsal() {
            levelorder(root);
        }

        public static void levelorder(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); 

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println(); 
                    if (q.isEmpty()) return;
                    q.add(null);
                } else {
                   
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) q.add(currNode.left);
                    if (currNode.right != null) q.add(currNode.right);
                }
            }
        }
    }
}
