import java.util.Scanner;
class A1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Area of Perimeter:");
        int RecPerimeter=sc.nextInt();


        System.out.println("Enter Rectangle Lenght:");
        int RectLength=sc.nextInt();


        int Rectbreadth=(RecPerimeter/2)-RectLength;
        int RecArea=RectLength*Rectbreadth;
        System.out.println("Breadth of a Rectangle is:"+Rectbreadth);
        System.out.println("Area of a Rectangle is:"+RecArea);

    }
}