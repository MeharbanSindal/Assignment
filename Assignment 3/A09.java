import java.util.Scanner;
class A9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a (A-Z) and (a-z):");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is uppercase.");
        } 
        
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } 
        
        else {
            System.out.println("Please Enter Valid Character.");
        }

    }
}

