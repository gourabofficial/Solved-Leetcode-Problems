
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = isPalindrome(num);
        if (result == num) {
            System.out.println("The number is a palindrome: " + num);
        } else {
            System.out.println("The number is not a palindrome: " + num);
        }   

        
    }

    static int isPalindrome(int n) {
        int reverse = 0;
        while (n != 0) {
            int digits = n % 10;
            reverse = reverse * 10 + digits;
            n = n/10;
          
        }
        return reverse;
    }
}
