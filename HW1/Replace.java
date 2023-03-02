package HW1;
public class Replace {
    public static String charReplace(String str, int index, char ch) {
        if (index < 0 || index >= str.length()) {
            // index is out of bounds, return the original string
            return str;
        } else {
            // replace the character at the specified index
            char[] chars = str.toCharArray();
            chars[index] = ch;
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        String str = "I MAKE BREAD";
        int index = 2;
        char ch = 'T';

        String newStr = charReplace(str, index, ch);

        System.out.println(newStr);
    }
}
