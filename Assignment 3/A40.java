import java.util.Scanner;
class A40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Sell Price: ");
        double sellPrice = sc.nextDouble();

        if (sellPrice > costPrice) {
            double profit = sellPrice - costPrice;
            System.out.println("Profit is: " + profit);
        } 
        
        else if (costPrice > sellPrice) {
            double loss = costPrice - sellPrice;
            System.out.println("Loss is : " + loss);
        } 
        
        else {
            System.out.println("No Profit!No Loss!.");
        }

    }
}

