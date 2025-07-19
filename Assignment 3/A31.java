import java.util.Scanner;

public class A31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice C and F :");
        char choice = sc.next().charAt(0);

        if (choice == 'c' || choice == 'C') {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            
            System.out.println("Temperature in Celsius: " + celsius);
        } 
        
        else if (choice == 'f' || choice == 'F') {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } 
        
        else {
            System.out.println("Invalid choice.");
        }

    }
}

