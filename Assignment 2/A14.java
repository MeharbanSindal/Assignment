import java.util.Scanner;
class A14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Diagonal 1:");
        int d1=sc.nextInt();

        System.out.println("Enter Diagonal 2:");
        int d2=sc.nextInt();

        System.out.println("Enter Length of one Diagonal:");
        int LengthOfOneDiagonal=sc.nextInt();

        double Area=(double)(0.5*LengthOfOneDiagonal*(d1+d2));
        System.out.println("Area of the Quadrilateral is:"+Area);

    }
}
