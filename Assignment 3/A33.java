import java.util.Scanner;
class A33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int div = num / 2;
        if (div * 2 == num) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

    }
}

