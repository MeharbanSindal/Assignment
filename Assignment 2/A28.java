import java.util.Scanner;
class A28 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Carpet Lenght:");
        int length=sc.nextInt();

        System.out.println("Enter Carpet Wide:");
        int wide=sc.nextInt();

        System.out.println("Enter Rate per Square meter:");
        int rate=sc.nextInt();

        int AreaOfCarpet=length*wide;
        int TotalPrice=AreaOfCarpet*rate;
        System.out.println("Total price is :"+TotalPrice);
    }
}
