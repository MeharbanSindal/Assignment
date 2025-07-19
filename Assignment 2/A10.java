import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side:");
        int Side=sc.nextInt();
        float AreaOfIsosceles=(float)(Side*Side)/2;
        System.out.println("Area of isosceles is:"+AreaOfIsosceles);
    }
}
