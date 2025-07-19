import java.util.Scanner;
class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {
            int num1 = num % 10;        
            num = num / 10;

            int num2 = num % 10;        
            num = num / 10;

            int num3 = num % 10;         
            num = num / 10;

            int num4 = num;            

            int reversed = num1 * 1000 + num2 * 100 + num3 * 10 + num4;

            System.out.println("Reversed number: "+reversed);
        } 
        
        else {
            System.out.println("Error Please Enter a 4-digit number.");
        }

    }
}

