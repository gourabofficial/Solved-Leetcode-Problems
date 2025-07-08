public class n_Number {

    public static void main(String[] args) {
        fun1(5);
    }

    static void fun1(int n) {
        {
            if (n == 0) {
                return;
            }
            fun1(n-1);
            System.out.println(n);
        }

    }
}
