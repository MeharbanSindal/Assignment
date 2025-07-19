import java.util.Scanner;
class A35 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Cylindrical solid Radius:");
        double radius=sc.nextDouble();

        System.out.println("Enter Cylindrical solid Heigth:");
        double heigth=sc.nextDouble();
        double SurfaceArea=2*3.14*radius*(radius+heigth);
        System.out.println("Surface Area of cylindrical solid:"+SurfaceArea);
    }
}
