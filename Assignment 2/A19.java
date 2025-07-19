import java.util.Scanner;
class A19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Edge of cube:");
        int cubeEdge=sc.nextInt();

        System.out.println("Enter the Hieght of cuboid:");
        int cuboidHeight=sc.nextInt();

        System.out.println("Enter the Breadth of cuboid:");
        int cuboidBreadth=sc.nextInt();

        System.out.println("Enter the Edge of cuboid:");
        int cuboidLenght=sc.nextInt();
        int CubeVolume=cubeEdge*cubeEdge*cubeEdge;
        int CuboidVolume=cuboidHeight*cuboidBreadth*cuboidLenght;
        System.out.println("cube volume is:"+CubeVolume);
        System.out.println("cuboid volume is:"+CuboidVolume);
        System.out.println("Cube volue more move: "+CubeVolume+">"+CuboidVolume);
    }    
}
