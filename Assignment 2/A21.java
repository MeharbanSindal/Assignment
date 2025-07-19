import java.util.Scanner;
class A21 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Lenght Of Wall:");
        int wallLenght=sc.nextInt();

        System.out.println("Enter the Breadth Of Wall:");
        int wallbreadth=sc.nextInt();

        System.out.println("Enter the Height Of Wall:");
        int wallheight=sc.nextInt();

        System.out.println("Enter the Lenght Of Brick:");
        int BrickLenght=sc.nextInt();

        System.out.println("Enter the Breadth Of Brick:");
        int BrickBreadth=sc.nextInt();

        System.out.println("Enter the Height Of Brick:");
        int Brickheight=sc.nextInt();

        int VolumeOfBrick=BrickLenght*BrickBreadth*Brickheight;
        int VolumeOfWall=(wallLenght*wallbreadth*wallheight);
        int TotalBrick=VolumeOfWall/VolumeOfBrick;
        System.out.println("Total brick inside a wall:"+TotalBrick);

    }    
}