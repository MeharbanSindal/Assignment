import java.util.Scanner;
class A27 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length of Dining Room:");
        int length=sc.nextInt();
        
        System.out.println("Enter Wide of Dining Room:");
        int wide=sc.nextInt();

        System.out.println("Enter Rate per Square meter:");
        int rate=sc.nextInt();

        int Area= length * wide;
        int TotalCost=Area*rate;
        System.out.println("Total cost of tilling:"+TotalCost);

    }
}
