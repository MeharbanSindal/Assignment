import java.util.Scanner;
class A19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a:");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping value is define:");
        System.out.println("a = " + a + ", b = " + b);

        // use third variable d=1,a=2,b=1

        int d = a;
        a = b;
        b = d;

        System.out.println("\nAfter Swapping with third variable:");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("Enter value of a: ");
        a = sc.nextInt();

        System.out.println("Enter value of b: ");
        b = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping with Bitwise XOR (^):");
        System.out.println("a = " + a + ", b = " + b);

    }
}

