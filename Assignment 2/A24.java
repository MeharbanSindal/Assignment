import java.util.Scanner;

class A24 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Length of Wall:");
        double wallLenght=sc.nextDouble();

        System.out.println("Enter the Height of Wall:");
        double wallHeight=sc.nextDouble();

        System.out.println("Enter the Thick of Wall:");
        double wallThick=sc.nextDouble();


        System.out.println("Enter the Lenght of Brick:");
        double brickLenght=sc.nextDouble();

        System.out.println("Enter the Width of Brick:");
        double brickWidth=sc.nextDouble();

        System.out.println("Enter the Thick of Brick:");
        double brickThick=sc.nextDouble();


        double VolumeOneBrick=brickLenght*brickWidth*brickThick;
        double VolumeOfWall=(wallLenght*100)*(wallHeight*100)*(wallThick*100);
        double NumberOfBricks=VolumeOfWall/VolumeOneBrick;
        double TotalCost=NumberOfBricks*900/1000;
        System.out.println("Total cost of bricks is:"+TotalCost);

    }
}

