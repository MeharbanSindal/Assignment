import java.util.Scanner;
class A24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive.");
        } 
        
        else if (num < 0) {
            System.out.println(num + " is Negative.");
        } 
        
        else {
            System.out.println("Zero.");
        }

    }
}

