import java.util.Scanner;
class A2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Area of Rectangle:");
        int RecArea= sc.nextInt();


        System.out.println("Enter the Rectangle of Breadth:");
        int RecBreadth= sc.nextInt();

        
        int RectLength=RecArea/RecBreadth;
        int RecPerimeter=2*(RectLength+RecBreadth);
        System.out.println("Rectangle length is:"+RectLength);
        System.out.println("Rectangle perimeter is:"+RecPerimeter);
    }
}

