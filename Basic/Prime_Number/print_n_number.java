
import java.util.Scanner;

public class print_n_number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the N number to check for prime numbers: ");
    int num = sc.nextInt();

    System.out.println("Prime numbers up to " + num + " : ");
    for (int i = 2; i <= num; i++) {
      if (isPrimeCheck(i)) {
        System.out.println(i + " ");
      }
    }
    System.out.println();
  }
  
  static boolean isPrimeCheck(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % 2 == 0) {
        return false;
      }
    }

    return true;
  }
}
