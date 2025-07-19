/*
    a carpet is 5m long and 4m wide.find its price at the rate of $ 205 per square m.
*/ 

class A28 {
    public static void main(String args[]){
        int length=5;
        int wide=4;
        int rate=205;
        int AreaOfCarpet=length*wide;
        int TotalPrice=AreaOfCarpet*rate;
        System.out.println("Total price is :"+TotalPrice);
    }
}
