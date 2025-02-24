package JavaBasic;

public class funoverloading {
    
    //sum of 2 nums
    public static int sum(int a,int b){  
        return a+b;

    }

    //sum of 3 nums
    public static int sum(int a,int b,int c){
        return a+b+c;

    }

    public static void main(String args[]){
        System.out.println(sum(5,3));
        System.out.println(sum(2,3,3));

    }

}
