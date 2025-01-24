//  compress string example = aaabbcccdd -> 3a2b3b2d;

public class StringCompression {
    public static String compressString(String str) {

        String newstr = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            /*
             * i<str.length() - 1 ae while ni
             * condition ma first ma write karvu
             * nahito jo && pachhi ae condition
             * lakho to indexr bound thse and error
             * avse beause && oprator ma && na
             * pelani condition pe cheack thase and
             * pachhi && pacchi ni condition check thay
             * 
             * 
             */

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; //
                i++;
            }

            if (count > 1) {
                newstr += count;

            }

            newstr += str.charAt(i);

        }
        return newstr;

    }

    public static void main(String args[]) {

        String str = "aaabbcccdd";

        System.out.println(compressString(str));

    }
}
