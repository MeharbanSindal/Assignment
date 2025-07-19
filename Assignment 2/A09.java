import java.util.Scanner;
class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the side of Equilateral:");
        int Side=sc.nextInt();

        float AreaOfEquilateral=(float)((Math.sqrt(3)/4)*Side*Side);
        System.out.println("AreaOfEquilateral is:"+AreaOfEquilateral);
    }
}
