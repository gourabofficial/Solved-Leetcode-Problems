public class RemoveDuplicatsString {
    public static void main(String[] args) {
        String str = "abbccddeeffa";
        removeDuplicatesFun(0, "", str);

    }

    static void removeDuplicatesFun(int index, String newStr, String str) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        if (newStr.indexOf(currentChar) != -1) {   // Character already exists - skip it (don't add duplicate)
            removeDuplicatesFun(index + 1, newStr, str);
        } else {
            newStr += currentChar;
            removeDuplicatesFun(index + 1, newStr, str);
        }

    }
}
