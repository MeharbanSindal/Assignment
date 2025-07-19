/*
    Find the surface area of the cylindrical solid whose radius is 7.7cm and heigthis 12cm.
*/ 

class A35 {
    public static void main(String args []){
        double radius=7.7;
        double heigth=12;
        double SurfaceArea=2*3.14*radius*(radius+heigth);
        System.out.println("Surface Area of cylindrical solid:"+SurfaceArea);
    }
}
