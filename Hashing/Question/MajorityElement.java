
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1,4,1,5,1,1,1,6,1};
        majority_element(nums);
    }

    public static void majority_element(int num[]){
        HashMap <Integer,Integer> map = new HashMap<>();
        int size = num.length;

        for(int i=0; i<size; i++){
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }else{
                map.put(num[i],1);
            }

        }
        for (int key : map.keySet()) {
            if(map.get(key) > size/3){
                System.out.println(key);
            }
        }

    }
}
