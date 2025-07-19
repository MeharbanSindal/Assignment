import java.util.Scanner;
class A21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number is: "+num1);
        }
        
        else if (num2 > num1) {
            System.out.println("Greater number is: "+num2);
        } 
        else {
            System.out.println("Equal.");
        }

    }
}

