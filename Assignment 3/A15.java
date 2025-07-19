import java.util.Scanner;

class A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of the bike: ");
        double CostPrice = sc.nextDouble();

        double tax; 

        if (CostPrice > 100000) {
            tax = 0.15; // 15%
        } 
        
        else if (CostPrice > 50000 && CostPrice <= 100000) {
            tax = 0.10; // 10%
        } else {
            tax = 0.05; // 5%
        }

        double taxAmount = CostPrice * tax;

        System.out.println("Road tax to be paid:" + taxAmount);

    }
}
