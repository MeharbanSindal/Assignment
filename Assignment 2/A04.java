import java.util.Scanner;
class A4{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Plot Length:");
        int PlotLength=sc.nextInt();
        
        System.out.println("Enter the Plot Width:");
        int PlotWidth=sc.nextInt();
        
        System.out.println("Enter Rate of per Hundred square meter:");
        int rate=sc.nextInt();

        int AreaOfPlot=PlotLength*PlotWidth;
        int TotalCost=(AreaOfPlot*rate)/100;
        System.out.println("Total cost is: $"+TotalCost);
    }
}