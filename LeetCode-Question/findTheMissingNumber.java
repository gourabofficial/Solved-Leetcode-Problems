
import java.util.HashSet;
import java.util.Set;

public class findTheMissingNumber {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,5};
        int size = arr.length +1;

        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        for(int i=0; i<size; i++){
            if(!set.contains(i)){
                System.out.println("Missing Element is: " +i);
                break;
            }
        }
    }

}
