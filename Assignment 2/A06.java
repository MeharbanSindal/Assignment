import java.util.Scanner;
class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A Side Of Tringle:");
        int Aside=sc.nextInt();

        System.out.println("Enter the B Side Of Tringle:");
        int Bside=sc.nextInt();

        System.out.println("Perimeter Of Tringle:");
        int PerimeterTringle=sc.nextInt();

        
        int c=PerimeterTringle-Aside-Bside;
        int s=(Aside+Bside+c)/2;
        double area=Math.sqrt(s*(s-Aside)*(s-Bside)*(s-c));
        System.out.println("Area of Tringle:"+area);

        
    }
}


