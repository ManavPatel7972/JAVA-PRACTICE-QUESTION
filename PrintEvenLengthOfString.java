/*
 Java String Program to Print Even-Length Words

 Input: s = "This is a java language"

Output: This is  java language

Explanation: All the elements with the length even are printed. 
 "This" length is 4 so printed whereas "a" length is 1 so not Printed.  
 */
public class PrintEvenLengthOfString {

    public static void main(String[] args) {
        String str = "This is a java language";
        printEvenLengthWords(str);
    }

    public static void printEvenLengthWords(String str) {
        int start = 0;
        int length = str.length();

        for (int i = 0; i <= length; i++) { // here <= because last print " " so index out of bound na thay te mate;
            if (i == length || str.charAt(i) == ' ') {
                int wordLength = i - start;
                if (wordLength % 2 == 0) {
                    System.out.print(str.substring(start, i) + " ");
                }
                start = i + 1;
            }
        }
    }

}
