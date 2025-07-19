import java.util.Scanner;
class A13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Area Of Right Triangle:");
        int AreaOfRightTriangle=sc.nextInt();

        System.out.println("Enter Length Of One Leg:");
        int LengthOfOneLeg=sc.nextInt();

        int LengthOfOtherLeg=AreaOfRightTriangle*2/LengthOfOneLeg;
        System.out.println("Length Of Other Leg is:"+LengthOfOtherLeg);
    }
}
