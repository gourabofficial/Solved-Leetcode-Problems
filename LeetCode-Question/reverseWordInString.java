public class reverseWordInString {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
}
