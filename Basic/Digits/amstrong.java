
import java.util.Scanner;

public class amstrong {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for Check amstrong: " );
    int num = sc.nextInt();


    if (check_amstrong(num)) {
      System.out.println("Yes,Its amstrong Number");
    } else {
      System.out.println("Not amstrong Number");
    }
  }
  
  static boolean check_amstrong(int num) {
    int originalNum = num;
    int sum = 0;
    while (num != 0) {
      int digit = num % 10;
      sum += (digit * digit * digit);
      num = num / 10;
    }
    return sum == originalNum;
  }
}
