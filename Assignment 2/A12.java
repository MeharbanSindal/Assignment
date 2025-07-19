import java.util.Scanner;
class A12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Hypotenuse:");
        int hypotenuse=sc.nextInt();

        System.out.println("Enter Base:");
        int base=sc.nextInt();

        int p=(int)(Math.sqrt((hypotenuse*hypotenuse)-(base*base)));
        double AreaOfRightAngle=(double)(0.5*base*p);
        System.out.println("Length of triangle:"+p);
        System.out.println("Area  of right angle triangle is:"+AreaOfRightAngle);
        
    }
}
