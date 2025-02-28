/*
 Input: originalString = "GeeksGeeks", 
            stringToBeInserted = "For", 
            index = 4

Output: "GeeksForGeeks"

Explanation: Adding the new String to orignal String at the index given.
 */

public class InsertStringInAnotherStringAtGivenIndex {
    public static void main(String[] args) {
        String str = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        System.out.println(insertString(str, stringToBeInserted, index));
    }

    static String insertString(String str, String stringToBeInserted, int index) {
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == index + 1) {
                newstr += stringToBeInserted; 
            }
            newstr += str.charAt(i); 
        }

        return newstr;
    }
}

