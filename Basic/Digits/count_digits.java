
public class count_digits {

  public static void main(String[] args) {
    int number = 123456710;

    int result = coutDigits(number);
    System.out.println("The digits  : " + result);

    int lastDigit = lastDigit(number);
    System.out.println("the last digit is : " + lastDigit);

    int sum = sumOfDigit(number);
    System.out.println("The sum: " + sum);

  }

  static int coutDigits(int n) {
    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  static int lastDigit(int num) {
    return num % 10;
  }

  static int sumOfDigit(int num) {
    int sum = 0;
    while (num != 0) {
       int digit = num % 10;
       sum += digit;
      //  System.out.println("1st: " +num);
       num = num / 10;
      //  System.out.println( "2nd " + num);
      }
    return sum;
  }
}