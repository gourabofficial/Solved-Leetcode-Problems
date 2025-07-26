// the is written by chatgpt , all operation . In The Problem we use the inbuild HashMap.


import java.util.LinkedList;

public class HashMapCode {
    static class  HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n->  nodes
        private int N; // N->  buckets
        private  LinkedList<Node> buckets[];

        //constructor of HashMap
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        // Hash function to get bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // Search for a key in the bucket and return its index
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // Rehash the HashMap when load factor exceeds threshold
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Transfer all nodes to new buckets
            n = 0;
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // Put operation - Insert or update key-value pair
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                // Key exists, update value
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // Key doesn't exist, add new node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Check if key exists in HashMap
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // Get value for a given key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        // Remove key-value pair from HashMap
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        // Get all keys in the HashMap
        public java.util.ArrayList<K> keySet() {
            java.util.ArrayList<K> keys = new java.util.ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // Check if HashMap is empty
        public boolean isEmpty() {
            return n == 0;
        }

        // Get the size of HashMap
        public int size() {
            return n;
        }

        // Print the HashMap for debugging
        public void printHashMap() {
            System.out.println("HashMap contents:");
            for (int i = 0; i < buckets.length; i++) {
                System.out.print("Bucket " + i + ": ");
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    System.out.print("(" + node.key + "," + node.value + ") ");
                }
                System.out.println();
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        // Testing put operation
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
        
        System.out.println("Size: " + hm.size());
        hm.printHashMap();
        
        // Testing get operation
        System.out.println("\nGet 'India': " + hm.get("India"));
        System.out.println("Get 'China': " + hm.get("China"));
        System.out.println("Get 'Pakistan': " + hm.get("Pakistan"));
        
        // Testing containsKey operation
        System.out.println("\nContains 'India': " + hm.containsKey("India"));
        System.out.println("Contains 'Pakistan': " + hm.containsKey("Pakistan"));
        
        // Testing remove operation
        System.out.println("\nRemoving 'China': " + hm.remove("China"));
        System.out.println("Size after removal: " + hm.size());
        hm.printHashMap();
        
        // Testing keySet operation
        System.out.println("\nAll keys: " + hm.keySet());
        
        // Testing isEmpty
        System.out.println("Is empty: " + hm.isEmpty());
    }
}
