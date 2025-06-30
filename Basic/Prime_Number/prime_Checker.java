
import java.util.Scanner;

public class prime_Checker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    // System.out.println(Math.sqrt(4));

    if (isPrime(num)) {
      System.out.println(num+ " is Prime Number");
    } else {
      System.out.println(num + " is not Prime ");
    }
  }

  static boolean isPrime(int num)
  {
    if (num <= 1)
      return false;
    
    if (num == 2 )
      return true;

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
