import java.util.Scanner;
class A34 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Base1:");
        int b1=sc.nextInt();

        System.out.println("Enter Base2:");
        int b2=sc.nextInt();

        System.out.println("Enter Height:");
        int height=sc.nextInt();

        float AreaOfTropezoid=(float)((b1+b2)*height)/2;
        int lenWalkAway=height,widthWalkAway=4,walkAwayArea=lenWalkAway*widthWalkAway;
        float WoodArea=(float)(AreaOfTropezoid-walkAwayArea);
        System.out.println("Area of Tropezoid:"+AreaOfTropezoid);
        System.out.println("Area of Walk Away:"+walkAwayArea);
        System.out.println("Area of Wood:"+WoodArea);
    }    
}
