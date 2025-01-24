import java.util.Scanner;

public class SubString {
    public static String subString(String str, int si, int ei) {

        String subStr = ""; //empty;

        for(int i=si;i<ei;i++){              // ending index is non including 
            subStr = subStr + str.charAt(i);

        }

        return subStr;



    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter a String:");

        str = sc.next();

        System.out.println("Enter a starting index = ");
        int si = sc.nextInt();

        System.out.println("Enter a ending index = ");   // // ending index is non including 
        int ei = sc.nextInt();

        System.out.println(subString(str, si, ei));

    }
}

