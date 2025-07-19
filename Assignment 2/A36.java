import java.util.Scanner;
class A36 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Surface area of a cylinder:");
        double diameter=sc.nextDouble();

        System.out.println("Enter Height of a cylinder:");
        double height=sc.nextDouble();
        
        double SurfaceArea=2*3.14*(diameter/2)*height+2*3.14*(diameter*diameter)/4;
        System.out.println("Surface area :"+SurfaceArea);
    }
}
