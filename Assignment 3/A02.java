import java.util.Scanner;
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int OneUnitCost = 100;

        System.out.print("Enter the Purchase Quantity: ");
        int Quantity = sc.nextInt();

        int totalCost = Quantity * OneUnitCost;

        if (totalCost > 1000) {
            double discount = totalCost *10/100;
            totalCost-=discount;
        }

        System.out.println("Total cost after Discount: " + totalCost);

    }
}
