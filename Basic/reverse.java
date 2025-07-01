
import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();

    int reverse = find_reverse(num);
    System.out.print("Before reverse: " + num);
    System.out.println(" ");
    System.out.println("After reverse: " +reverse);
  }
  
  static int find_reverse(int num) {
    int reverse = 0;
    while (num != 0) {
      int digits = num % 10;
      reverse = reverse * 10 + digits;
      num = num / 10;
    }
    return reverse;
  }
}
