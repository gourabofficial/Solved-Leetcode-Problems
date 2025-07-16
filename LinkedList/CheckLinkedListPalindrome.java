import java.util.LinkedList;
import java.util.Scanner;

public class CheckLinkedListPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean result = isPalindrome(num);
        if (result) {
            System.out.println("The number is a palindrome: " + num);
        } else {
            System.out.println("The number is not a palindrome: " + num);
        } 
    }

    static boolean   isPalindrome(int num){
        LinkedList <Integer> list = new LinkedList<>();
        int originalNum = num;
        
        //step 1 
        while(num > 0){
            int digit = num %10;
            list.add(digit);
             num = num/10;
        }

        //step 2 
        int start = 0;
        System.out.println( "start" +start);
        int end = list.size() -1;
        System.out.println("end" +end);
        // System.out.println(list.size());
        while(start < end){
            if(!list.get(start).equals(list.get(end))){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    
}
