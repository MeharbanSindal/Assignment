import java.util.Scanner;
class A17{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Lenght of Board");
        int lenght=sc.nextInt();

        System.out.println("Enter Width of Board");
        int width=sc.nextInt();

        int AreaOfBoard=2*(lenght*width);
        System.out.println("Luci need ribbon:"+AreaOfBoard);
    }
}
