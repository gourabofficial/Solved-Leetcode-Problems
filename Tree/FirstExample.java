public class FirstExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertData(8);
        tree.insertData(7);
        tree.insertData(12);
        tree.insertData(15);
        tree.insertData(7);
        tree.insertData(2);
        tree.insertData(5);

        // tree.inorder();
        // tree.preorder();
        tree.postorder();
        System.out.println();

    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    public static class BinaryTree { 
        static Node root;

        public static void insertData(int data) {
            root = insertRec(root, data);
        }

        public static Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data); // create the root first.
            } else if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        public void inorder() {
            inorderRec(root);
        }

        public static void inorderRec(Node root) {
            if (root == null) {
                return;
            } else {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }

        }

        //pre order
        public static void preorder(){
            preorderRec(root);
        }
        public static void preorderRec(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }

        //post order
        public static void postorder(){
            postorderRec(root);
        }

        public static void postorderRec(Node root){
            if(root == null){
                return;
            }
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.data + " ");

        }
    }
}
