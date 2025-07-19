import java.util.Scanner;
class A44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your choice +,>,==: ");
        String choice = sc.next();

        if (choice.equals("+")) {
            int sum = num1 + num2;
            System.out.println("Addition = " + sum);
        } 
        
        else if (choice.equals(">")) {
            if (num1 > num2) {
                System.out.println(num1 + " is greater.");
            } 
            
            else if (num2 > num1) {
                System.out.println(num2 + " is greater.");
            } 
            
            else {
                System.out.println("Both numbers are equal.");
            }
        } 
        
        else if (choice.equals("==")) {
            if (num1 == num2) {
                System.out.println("Numbers are equal.");
            } else {
                System.out.println("Numbers are not equal.");
            }
        } else {
            System.out.println("Invalid choice!");
        }

    }
}



