import java.util.Scanner;
class A34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter side2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter side3: ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

            if (side1 == side2 && side2 == side3) {

                System.out.println("It is an Equilateral Triangle.");

            } 
            
            else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("It is an Isosceles Triangle.");
            } 
            
            else {
                System.out.println("It is a Scalene Triangle.");
            }

        } 
        
        else {
            System.out.println("sides not valid.");
        }

    }
}

