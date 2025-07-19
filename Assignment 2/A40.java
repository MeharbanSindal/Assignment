import java.util.Scanner;

public class A40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Radius of Cylinder:");
        int r=sc.nextInt();

        System.out.println("Enter Height of Cylinder:");
        int h=sc.nextInt();
        
        double VolumeOfCylinder=(double)((3.14)*r*r*h);
        System.out.println("Volume of cylinder is:"+VolumeOfCylinder);
    }
    
}
