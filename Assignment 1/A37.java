/*
    the surface of the cylinder is 149cm^2.the cylinder height is 6cm.what is the diameter of this cylinder.

*/ 


class A37 {
    public static void main(String args []){
        int surface=149;
        int height=6;
        float diameter=(float)(2*(Math.sqrt(height*height+2*(surface/3.14))-height)/2);
        System.out.println("Diameter of cylinder is:"+diameter);
    }
}
