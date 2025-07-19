import java.util.Scanner;

class A20 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Lenght Of Brick:");
        int lenght=sc.nextInt();

        System.out.println("Enter  Breadth Of Brick:");
        int breadth=sc.nextInt();

        System.out.println("Enter  Height Of Brick:");
        int height=sc.nextInt();

        int Volume=lenght*breadth*height;
        System.out.println("Volume of ice-cream is:"+Volume);
    }
}