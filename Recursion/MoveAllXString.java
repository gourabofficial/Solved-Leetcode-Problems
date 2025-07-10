public class MoveAllXString {
    public static void main(String[] args) {
        String str = "axbcxxd";
        skip(0, "", str);
        // Output: abcd
        // Explanation: All 'x' characters are removed from the string.
    }

    static void skip(int index, String newStr, String str){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if(currentChar == 'x'){
                skip(index+1, newStr, str);
        }else{
            newStr +=currentChar;
            skip(index+1, newStr, str);
        }
    }
}
