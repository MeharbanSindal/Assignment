import java.util.Scanner;
class A32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println(number + " is POSITIVE.");
        } 
        
        else if (number < 0) {
            System.out.println(number + " is NEGATIVE.");
        } 
        
        else {
            System.out.println("Zero.");
        }

    }
}

