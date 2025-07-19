import java.util.Scanner;
class A32 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Garden a side of Lenght:");
        int lenght=sc.nextInt();

        System.out.println("Enter Swimming pool a side lenght:");
        int lenSwimming=sc.nextInt();
        
        int AreaOfGarden=lenght*lenght;
        int AreaOfSwimming=lenSwimming*lenSwimming;
        int OnlyAreaGarden=AreaOfGarden-AreaOfSwimming;
        System.out.println("The area of garden is :"+OnlyAreaGarden);

    }
}
