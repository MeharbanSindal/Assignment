import java.util.Scanner;

class A39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Diameter of cylinder:");
        double diameter=sc.nextDouble();

        System.out.println("Enter Height of cylinder:");
        double height=sc.nextDouble();

        double dF=diameter/2;
        double SurfaceOfCylinder=2*Math.PI*dF*height+2*Math.PI*dF*dF;
        System.out.println("Surface of Cylinder is:"+SurfaceOfCylinder);
    }
}
