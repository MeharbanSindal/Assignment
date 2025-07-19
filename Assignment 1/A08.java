/*
    Find the base of a triangle whose altitude is 20 cm and area is 0.8m^2.
 */



/*
0.8 is convert to the cm is 0.8*100=80
*/ 

class A8 {
    public static void main(String[] args) {
        int AltitudeTringle=20;
        int AreaTringle=80;            
        int Basetringle=(AreaTringle*2)/AltitudeTringle;
        System.out.println("Base of the Triangle is :"+Basetringle);
    }
}
