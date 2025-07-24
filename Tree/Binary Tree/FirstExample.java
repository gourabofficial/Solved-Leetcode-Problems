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
        // tree.postorder();

        // int count = tree.countNode(BinaryTree.root);
        // System.out.println(count);

        int sumOfNodes = tree.sumOfNodes(BinaryTree.root);
        System.out.print("Sum of the nodes: " + sumOfNodes);

        System.out.println();

        int heightOfTheTree = tree.heightOfTheTree(BinaryTree.root);
        System.out.println("Height of the Tree is : " + heightOfTheTree);

        System.out.println();

        int diameter = tree.CalculateDiameter(BinaryTree.root);
        System.out.println("Diameter of the tree is : " + diameter);

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
        static int AnsOfDiamiter = 0;

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

        // pre order
        public static void preorder() {
            preorderRec(root);
        }

        public static void preorderRec(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }

        // post order
        public static void postorder() {
            postorderRec(root);
        }

        public static void postorderRec(Node root) {
            if (root == null) {
                return;
            }
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.data + " ");

        }

        // count the nodes
        public static int countNode(Node root) {
            if (root == null) {
                return 0;
            }

            int left = countNode(root.left);
            int right = countNode(root.right);

            return 1 + left + right;
        }

        // sun of nodes

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = sumOfNodes(root.left);
            int right = sumOfNodes(root.right);

            return left + right + root.data;
        }

        // height of the tree

        public static int heightOfTheTree(Node root) {
            if (root == null) {
                return 0;
            }
            int left = heightOfTheTree(root.left);
            int right = heightOfTheTree(root.right);

            return Math.max(left, right) + 1;
        }

        // diameter of a binary tree
        public static int CalculateDiameter(Node root){
            diamiter(root);
            return AnsOfDiamiter;
        }
        public static int diamiter(Node root){

        if(root == null){
        return 0;
        }

        int diam1 = diamiter(root.left);
        int diam2 = diamiter(root.right);

        int finaldiam = diam1 + diam2 + 1;
        AnsOfDiamiter = Math.max(AnsOfDiamiter, finaldiam);
        return 1 + Math.max(diam1, diam2);

        }

    }
}
