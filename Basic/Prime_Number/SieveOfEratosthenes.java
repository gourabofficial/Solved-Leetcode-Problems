
import java.util.Scanner;

public class SieveOfEratosthenes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Findes prime upto: ");
    int num = sc.nextInt();

    boolean[] isPrime = new boolean[num + 1];

    for (int i = 2; i <= num; i++) {
      isPrime[i] = true;

    }

    isPrime[0] = false;
    isPrime[1] = false;

    // Start from 2 and mark all multiples as not prime
    for (int i = 2; i * i <= num; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= num; j += i) {
          isPrime[j] = false;
        }
      }
    }

    System.out.println("Prime numbers up to " + num + ":");
    
    for (int i = 2; i < num; i++) {
      if (isPrime[i]) {
        System.out.println(i + " ");
      }
    }

  }

}
