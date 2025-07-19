import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Area Of Tringle");
        int AreaOfTriangle=sc.nextInt();

        System.out.println("Enter the Base Of Tringle");
        int base=sc.nextInt();

        System.out.println("Enter the Heigth Of Tringle");
        int height=sc.nextInt();

        double A=(double)Math.sqrt(AreaOfTriangle/(0.5*base*height));
        double Height=(double)(height*A);
        double Base=(double)(base*A);

        System.out.println("Height of the triangle is: "+Height);
        System.out.println("Base of the triangle is: "+Base);
    }
}
