
public class factorial {
    public static void main(String[] args) {
        int result = find_factorial(5);
        System.out.println("Factorial is: " + result);
    }

    static int find_factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * find_factorial(num - 1);

    }
}
// 5 = 5*4*3*2*1