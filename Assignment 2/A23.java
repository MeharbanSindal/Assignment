import java.util.Scanner;
class A23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cubical Boxex of Cubical Sides:");
        int cubeSide=sc.nextInt();

        System.out.println("Enter CartonLenght:");
        int CartonLenght=sc.nextInt();

        System.out.println("Enter Carton Breadth:");
        int CartonBreadth=sc.nextInt();
        
        System.out.println("Enter Carton Height:");
        int CartonHeight=sc.nextInt();
        
        int VolumeOfCarton=CartonLenght*CartonBreadth*CartonHeight;
        int CubicalVolume=cubeSide*cubeSide*cubeSide;
        int NumberOfBox=VolumeOfCarton/CubicalVolume;
        System.out.println("Number of Box is:"+NumberOfBox);
    }    
}
