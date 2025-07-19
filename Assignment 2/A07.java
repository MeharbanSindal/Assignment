
import java.util.Scanner;
class A7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Area of Triangle:");
        int AreaTriangle=sc.nextInt();

        System.out.println("Enter the Base of Triangle:");
        int BaseTriangle=sc.nextInt();
        int HeightTringle=(2*AreaTriangle)/BaseTriangle;
        System.out.println(HeightTringle);
    }
}