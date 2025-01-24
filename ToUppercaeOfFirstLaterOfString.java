// for a given string convert each the first letter of each word to uppercase;

public class ToUppercaeOfFirstLaterOfString {
    public static String toUppeCase(String str) {

        String newString = ""; // empty;

        char ch = Character.toUpperCase(str.charAt(0));

        newString = newString + ch;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                newString += str.charAt(i);

            }

            if (str.charAt(i) == ' ') {

                newString += str.charAt(i);

                i++;

                newString += Character.toUpperCase(str.charAt(i));
            }

        }
        return newString;

    }

    public static void main(String args[]) {

        String str = "hellow manav delvadiya";

        System.out.println(toUppeCase(str));
    }
}
