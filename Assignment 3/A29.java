import java.util.Scanner;
class A29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();

        int lowest = num1;

        if (num2 < lowest) {
            lowest = num2;
        }
        else if (num3 < lowest) {
            lowest = num3;
        }
        else if (num4 < lowest) {
            lowest = num4;
        }

        System.out.println("Lowest number is: " + lowest);

    }
}
