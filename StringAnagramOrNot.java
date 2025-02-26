/*
Input: str1 = "silent"
            str2 ="listen"
Output: Strings are Anagram 

Explaination: As all the elements in str1 are exact same as to create str2 .
i.e., we can create str2 using elements of str1 without removing any element or removing any extra element
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagramOrNot {
    public static void main(String[] args) {
       
        char[] str1 = {'s','i','l','e','n','t'};
        char[] str2 = {'l','i','s','t','e','n'};
        
       if(isAnagram(str1, str2)){
        System.out.println("The two String Are Anagram");
       }
       else{
        System.out.println("The two String Are Not Anagram");
      
       }
    }

    static boolean isAnagram(char[] str1, char[] str2) {
        // this .sort method is only sort arr type not String so conver String to char
        // Array;

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (str1.length != str2.length) {
            return false;
        }

        for (int i = 0; i < str1.length; i++) {
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }

}