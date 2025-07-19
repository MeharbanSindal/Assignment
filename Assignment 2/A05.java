import java.util.Scanner;
class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Total Fence:");
        int TotalFence=sc.nextInt();

        System.out.println("Enter The Park Length:");
        int ParkLength=sc.nextInt();

        System.out.println("Enter Rate per meter:");
        int RatePerMeter=sc.nextInt();
        int TotalArea=TotalFence/RatePerMeter;
        int ParkBreadth=TotalArea/ParkLength;
        int ParkPerimeter=2*(ParkLength+ParkBreadth);
        System.out.println("Breadth of park is:"+ParkBreadth);
        System.out.println("Perimeter of park is:"+ParkPerimeter);
        System.out.println("Area of a Park:"+TotalArea);
    }
}

