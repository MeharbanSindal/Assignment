
// import java.util.Scanner;
// class A26 {
//     public static void main(String args[]){

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter Length of Brick:");
//         int BrickLength=sc.nextInt();

//         System.out.println("Enter Wide of Brick:");
//         int BrickWide=sc.nextInt();

//         System.out.println("Enter Length of Path:");
//         int PathLength=sc.nextInt();

//         System.out.println("Enter Width of Path:");
//         float PathWidth=sc.nextFloat();


//         float AreaOfPath=(float)(PathLength*PathWidth);
//         float OneBrickArea=(float)((BrickLength/100)*(BrickWide/100));
//         float TotalBricks=(float)(AreaOfPath/OneBrickArea);
//         System.out.println("Total number of bricks are:"+TotalBricks);

//     }
// }


import java.util.Scanner;

class A26 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Brick:");
        int brickLength = sc.nextInt();

        System.out.println("Enter Width of Brick:");
        int brickWidth = sc.nextInt();

        System.out.println("Enter Length of Path:");
        float pathLength = sc.nextFloat();

        System.out.println("Enter Width of Path (in meters):");
        float pathWidth = sc.nextFloat();

        float areaOfPath = pathLength * pathWidth;
        float oneBrickArea = (brickLength / 100.0f) * (brickWidth / 100.0f);
        float totalBricks = areaOfPath / oneBrickArea;
        System.out.println("Total number of bricks required: " + totalBricks);
    }
}

