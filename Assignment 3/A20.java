import java.util.Scanner;
class A20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter Swapping using XOR:");
        System.out.println("a = " + a + ", b = " + b);

    }
}

