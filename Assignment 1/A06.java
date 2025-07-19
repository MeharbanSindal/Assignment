
/* 
    Find the area of a triangle,sides of which are 10cm and 9cm and the perimeter is 36cm.

*/



class A6 {
    public static void main(String[] args) {
        int Aside=10;
        int Bside=9;
        int PerimeterTringle=36;
        int c=PerimeterTringle-Aside-Bside;
        int s=(Aside+Bside+c)/2;
        double area=Math.sqrt(s*(s-Aside)*(s-Bside)*(s-c));
        System.out.println(area);

        
    }
}
