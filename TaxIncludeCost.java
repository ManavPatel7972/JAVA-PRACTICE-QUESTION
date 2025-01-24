
/*
 : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and 
an eraser. You have to output the total cost of the items back to the user as their bill. 
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
import java.util.*;

public class TaxIncludeCost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a price of item1:");
        float item1 = sc.nextFloat();
        System.out.println("enter a price of item2:");
        float item2 = sc.nextFloat();
        System.out.println("enter a price of item3:");
        float item3 = sc.nextFloat();

        float totalcost = item1 + item2 + item3;
        System.out.println(totalcost);

        System.out.println("after gst added total cost:");
        float gstcost = (float) 0.18 * totalcost + totalcost;
        System.out.println(gstcost);

    }

}
