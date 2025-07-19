/*
    if it costs 1600 rs.to fence a rectangular park of length 20m at the rate of 25 rs.per m^2 ,find the breadth of the park and its perimeter.Also find the area of the field
 */



class A5 {
    public static void main(String[] args) {
        int TotalFence=1600;
        int ParkLength=20;
        int RatePerMeter=25;
        int TotalArea=TotalFence/RatePerMeter;
        int ParkBreadth=TotalArea/ParkLength;
        int ParkPerimeter=2*(ParkLength+ParkBreadth);
        System.out.println("Breadth of park is:"+ParkBreadth);
        System.out.println("Perimeter of park is:"+ParkPerimeter);
        System.out.println("Area of a Park:"+TotalArea);
    }
}
