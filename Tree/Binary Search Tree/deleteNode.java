
public class deleteNode {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertData(10);
        tree.insertData(20);
        tree.insertData(30);
        tree.insertData(40);
        tree.insertData(6);

        System.out.println("Inorder traversal of the binary search tree:");
        tree.inorder();
        System.out.println();


        //delete a node
        int deleteValue = 20;
        tree.root = tree.deleteNode(tree.root, deleteValue);
        System.out.println("Inorder traversal after deleting " + deleteValue + ":");
        tree.inorder();

        System.out.println();
    }

    // node
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    // binary search tree

    public static class BinarySearchTree {
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

        // Delete the node operation
        public Node deleteNode(Node root, int key) {
            if (root == null) {
                return null;
            }
            // traverse to the node first .
            if (key < root.data) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.data) {
                root.right = deleteNode(root.right, key);
            } else {

                // case 1 -> Node has no child
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case 2 -> Node has only one child
                else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // case 3 -> Node has two child
                // minimum value in right side 

                int minValue = findMin(root.right);
                root.data  = minValue;

                root.right = deleteNode(root.right, minValue);
            }
            return root;
        }

        // helper fun For find the minimum value in the case 3
        public int findMin(Node node) {
            int min = node.data;
            while (node.left != null) {
                min = node.left.data;
                node = node.left;
            }
            return min;
        }

    }
}
