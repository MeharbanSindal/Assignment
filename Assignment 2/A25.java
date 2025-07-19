import java.util.Scanner; 
class A25 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Brick:");
        int numberOfBrick=sc.nextInt();

        System.out.println("Enter Lenght of Brick:");
        int LenghtBrick=sc.nextInt();

        System.out.println("Enter Number of Brick:");
        int WidthBrick=sc.nextInt();

        int areaOfOneBrick=LenghtBrick*WidthBrick;
        int TotalAreaPath=areaOfOneBrick*numberOfBrick;
        System.out.println("The area of path:"+TotalAreaPath);
    }
}