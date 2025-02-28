/*
Given a string of digits, remove leading zeros from it.
Illustrations: 

Input : 00000123569
Output: 123569

Input: 000012356090
Output: 12356090
*/

public class RemoveLeadingZerosInString{
    public static void main(String[] args) {
        String str = "00000122222350690";
        System.out.println(removeLeadingZeros(str));
    }

    static String removeLeadingZeros(String str){
        int count = 0;
        String newStr = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                count++;
            }
           else{
            break;
           }
        }
        for(int i =count;i<str.length();i++){
            newStr += str.charAt(i);
        }
        
        return newStr;
    }
}