
import java.util.Scanner;

class A42 {
    public static void main(String args []){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Diameter of Cylinder:");
        double diameter=sc.nextDouble();

        System.out.println("Enter Height of Cylinder:");
        double height=sc.nextDouble();

        double radius= diameter/2;

        double VolumeOfCylinder=3.14*radius*radius*height;
        System.out.println("Volume of Cylinder is:"+VolumeOfCylinder);
    }
}
