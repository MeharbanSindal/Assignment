import java.util.Scanner;
class A8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Altitude of Triangle:");
        int AltitudeTringle=sc.nextInt();

        System.out.println("Enter the Area of Triangle:");
        int AreaTringle=sc.nextInt();

        int Basetringle=(AreaTringle*2)/AltitudeTringle;
        System.out.println("Base of the Triangle is :"+Basetringle);
    }
}