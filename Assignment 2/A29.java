import java.util.Scanner;
class A29 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lenght of floor:");
        int lenght=sc.nextInt();

        System.out.println("Enter the width of floor:");
        int width=sc.nextInt();

        System.out.println("Enter the Square tile of side:");
        int Side=sc.nextInt();

        int AreaOfFloor=lenght*width;
        int TilesSide=Side*Side;
        int TotalTiles=AreaOfFloor/TilesSide;
        System.out.println("Tital number of tiles:"+TotalTiles);
    }
}
