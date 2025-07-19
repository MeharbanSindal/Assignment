import java.util.Scanner;
class A38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Volume of the Cylinder:");
        int Volume=sc.nextInt();

        System.out.println("Enter Radius of the Cylinder:");
        int radius=sc.nextInt();

        
        float h=(float)(Volume/(3.14*radius*radius));
        float Surface=(float)(2*3.14*radius*(radius+h));
        System.out.println("Surface of the cylinder:"+Surface);
    }
}
