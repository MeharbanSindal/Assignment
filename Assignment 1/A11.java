/*
    The base and height of a triangle are in the ratio 8:5 and its area is 320m^2.Find the heigth and base of the triangle.


    320=1/2*8x*5x
 */



public class A11 {
    public static void main(String[] args) {
        int AreaOfTriangle=320;
        int base=8;
        int height=5;
        double A=(double)Math.sqrt(AreaOfTriangle/(0.5*base*height));
        double Height=(double)(height*A);
        double Base=(double)(base*A);

        System.out.println("Height of the triangle is: "+Height);
        System.out.println("Base of the triangle is: "+Base);
    }
}
