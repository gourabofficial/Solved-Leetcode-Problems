
public class fibonacci {
    public static void main(String[] args) {
        int result = fib(5);
        System.out.println("Fibonacci of is: " + result);
        // System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}


// 0 1 1 2 3 5 8 13