package JavaBasic;

public class decimalTobinary {
    
    public static void decTobin(int decNum){
    int mynum = decNum;
    int binNum = 0;
    int pow = 0;

    while(decNum > 0){
        int rem = decNum % 2;
        binNum = binNum + rem * ((int)Math.pow(10,pow));
        pow++;
        decNum/=2;
        
    }
    System.out.println("Decimal "+ mynum + " = " + binNum);

   }

   public static void main(String args[]){
    decTobin(15);
   }
}


