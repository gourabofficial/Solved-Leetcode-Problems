


public class FirstExample {
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

    int searchValue = 200;
    if(tree.search(tree.root,searchValue)){
        System.out.println("Element " + searchValue + " is present in the tree.");
    }else{
        System.out.println("Element " + searchValue + " is not present in the tree.");
    }


   }
   
   //Node 
   static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }
   public static class BinarySearchTree{
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

        //search the element 

        public static boolean  search(Node root,int key){

            if(root == null){
                return  false;
            }
            if(root.data == key){
                return true;
            }
            else if(root.data > key){
               return search(root.left, key);
            }
            else {
              return  search(root.right, key);
            }
        }
   }
}
