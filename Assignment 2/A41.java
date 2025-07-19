import java.util.Scanner;

class A41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Height Of the cylinder:");
        int height=sc.nextInt();

        System.out.println("Enter Diameter Of the cylinder:");
        int diameter=sc.nextInt();
        
        double VolumeOfCylinder=(double)((3.14)*(diameter*diameter/4)*height);
        System.out.println("Volume of cylinder is:"+VolumeOfCylinder);
    }
    
}
