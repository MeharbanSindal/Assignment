/*
    What is the surface area of a cylinder if the diameter is 15m height is 7m.
*/ 

class A36 {
    public static void main(String args []){
        double diameter=15;
        double height=7;
        double SurfaceArea=2*3.14*(diameter/2)*height+2*3.14*(diameter*diameter)/4;
        System.out.println("Surface area :"+SurfaceArea);
    }
}
