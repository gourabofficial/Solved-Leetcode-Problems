
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

        private int n;
        private int N;
        private  LinkedList<Node> buckets[];

        //constructor of HashMap
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        public void put(K key, V value){
            

        }

        public boolean containsKey(K key){
            return false;
        }
    }
}
