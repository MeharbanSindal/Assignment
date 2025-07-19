import java.util.Scanner;
class A28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator +, -, *, /, %: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Add: " +(num1 + num2));
                break;

            case '-':
                System.out.println("Sub: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multi: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Div: " + (num1 / num2));
                } 
                
                else {
                    System.out.println("Error");
                }
                break;


            case '%':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 % num2));
                } 
                
                else {
                    System.out.println("Error");
                }
                break;
                
            default:
                System.out.println("Invalid operator!");
        }

    }
}

