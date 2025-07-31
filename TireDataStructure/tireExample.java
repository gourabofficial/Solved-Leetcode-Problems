public class tireExample {
    public static void main(String[] args) {
        String words[] = {"hello", "world", "hi", "her", "hero"};
        
        // Insert all words into the trie
        for (String word : words) {
            insert(word);
        }
        
        // Test search functionality
        System.out.println("Search 'hello': " + search("hello"));
        System.out.println("Search 'he': " + search("he"));
        System.out.println("Search 'her': " + search("her"));
        System.out.println("Search 'xyz': " + search("xyz"));
        
        // Test prefix functionality
        System.out.println("Has prefix 'he': " + startsWith("he"));
        System.out.println("Has prefix 'wor': " + startsWith("wor"));
        System.out.println("Has prefix 'xyz': " + startsWith("xyz"));
    }

    // node class ->
    static class Node {
        Node children[];
        boolean eow; // end of word

        // constructor of Node 
        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false; 
        }
    }

    // node root ->
    static Node root = new Node();

    // insert operation
    public static void insert(String word) {
        Node current = root; // Use a current pointer instead of modifying root
        
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node(); // create a new node 
            }

            current = current.children[index]; // move to next node
        }
        
        // Mark end of word after the loop
        current.eow = true;
    }

    // search operation
    public static boolean search(String word) {
        Node current = root;
        
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            
            if (current.children[index] == null) {
                return false;
            }
            
            current = current.children[index];
        }
        
        return current.eow; // return true only if it's end of a word
    }

    // check if any word starts with given prefix
    public static boolean startsWith(String prefix) {
        Node current = root;
        
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            
            if (current.children[index] == null) {
                return false;
            }
            
            current = current.children[index];
        }
        
        return true; // prefix exists
    }
}