
import java.util.Scanner;

// euclid algorithm for find gcd 

public class gcd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first  Numbers:  ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    int gcd = find_gcd(a, b);
    System.out.println(a + " & " + b + " gcd is : " + gcd);


    int lcm = find_lcm(a, b);
    System.out.println("The LCM is : " +lcm);

    sc.close();
  }
   
  static int find_gcd(int a, int b) {
    while (a > 0 && b > 0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    if (a == 0)
      return b;
    return a;
  }

  static int find_lcm(int a, int b) {
    return (a * b) / find_gcd(a, b);
  }
}
