import java.util.Scanner;
class A30 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bedroom Lenght:");
        int BedroomLength=sc.nextInt();

        System.out.println("Enter the Bedroom Wide:");
        int BedroomWide=sc.nextInt();

        System.out.println("Enter the Tile Lenght:");
        int TileLength=sc.nextInt();

        System.out.println("Enter the Tile Lenght:");
        int TileWidth=sc.nextInt();

        int AreaOfBedroom=BedroomLength*BedroomWide;
        int AreaTiles=TileLength*TileWidth;
        int TotalTiles=AreaOfBedroom/AreaTiles;
        System.out.println("Total tiles are:"+TotalTiles);

    }
}
