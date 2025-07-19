/*
    Find the cost of tilling a dining room 20m long and 15m wide at the rate of $ 5 per square m.
*/ 

class A27 {
    public static void main(String args[]){
        int length=20;
        int wide=15;
        int Area= length * wide;
        int rate=5;
        int TotalCost=Area*rate;
        System.out.println("Total cost of tilling:"+TotalCost);

    }
}
