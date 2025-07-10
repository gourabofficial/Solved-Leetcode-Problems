
import java.util.HashSet;

public class Subsequence {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        SubsequenceGenerator(0, str, "",set);
    }

    static void SubsequenceGenerator(int index , String str,String newStr, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        char currChar =str.charAt(index);

        SubsequenceGenerator(index +1, str, newStr+currChar,set);

        SubsequenceGenerator(index+1, str, newStr,set);

    }
}
