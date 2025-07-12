public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        generatePermutation(str, "");
    }

    static void generatePermutation(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String remaining  = str.substring(0,i) + str.substring(i+1);

            generatePermutation(remaining ,  currChar+newStr);

        }
    }
}
