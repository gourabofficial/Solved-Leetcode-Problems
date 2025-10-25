public class validPalindrome {
    public static void main(String[] args) {
        String s = "aaabba";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}
