import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        ArrayList <Integer> subset = new ArrayList<>();
        int n = 3;
        findSubset(n, subset);

    }
    static void findSubset(int n , ArrayList<Integer> subset){
        //base case 
        if(n == 0){
            System.out.println(subset);
            return;
        }

        //include the element
        subset.add(n);
        findSubset(n-1, subset);

        //exclude the element
        subset.remove(subset.size() - 1);
        findSubset(n-1, subset);


    }
}
