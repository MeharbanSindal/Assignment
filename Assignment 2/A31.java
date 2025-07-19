import java.util.Scanner;
class A31 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Perimeter:");
        int perimeter=sc.nextInt();
        int SideOfSquare=perimeter/4;
        int AreaOfSquare=SideOfSquare*SideOfSquare;
        System.out.println("Area Of Square is:"+AreaOfSquare);
    }
}
