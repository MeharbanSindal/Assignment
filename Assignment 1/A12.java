/*
    Find the area of a right angled triangle whose hypotenuse is 13cm and one of its sides containing the right angle is 12 cm.Find the length of the other side. 

*/


class A12{
    public static void main(String[] args) {
        int hypotenuse=13;
        int base=12;
        int p=(int)(Math.sqrt((hypotenuse*hypotenuse)-(base*base)));
        double AreaOfRightAngle=(double)(0.5*base*p);
        System.out.println("Length of triangle:"+p);
        System.out.println("Area  of right angle triangle is:"+AreaOfRightAngle);
        
    }
}