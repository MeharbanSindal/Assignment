import java.util.Scanner;
class A3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Tiles Length:");
        int TilesLength=sc.nextInt();


        System.out.println("Enter The Tiles Breadth:");
        int TilesBreadth=sc.nextInt();

        System.out.println("Enter The Length of rectangele region:");
        int RegionLength=sc.nextInt();

        System.out.println("Enter The Breadth of rectangele region::");
        int RegionBreadth=sc.nextInt();

        int AreaOfTiles=TilesLength*TilesBreadth;
        int AreaOfRegion=RegionLength*RegionBreadth;
        int ReqTiles=AreaOfRegion/AreaOfTiles;
        System.out.println("Reqiured tiles is :"+ReqTiles);
    }
}

