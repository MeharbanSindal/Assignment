/*
    Find the cost of tiling a rectangular plot of land 300m long and 150m wide at the rate of $6 per hundred square m.
 */



class A4{
    public static void main(String args[]){
        int PlotLength=300;
        int PlotWidth=150;
        int AreaOfPlot=PlotLength*PlotWidth;
        int rate=6;
        int TotalCost=(AreaOfPlot*rate)/100;
        System.out.println("Total cost is: $"+TotalCost);
    }
}
