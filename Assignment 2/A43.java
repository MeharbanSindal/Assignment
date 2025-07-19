import java.util.Scanner;
class A43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Cone Height:");
        int height=sc.nextInt();

        System.out.println("Enter Slant Height:");
        int SlantHeight=sc.nextInt();

        System.out.println("Enter Rate per Square meter:");
        int rate=sc.nextInt();

        float r=(float)(Math.sqrt(SlantHeight*SlantHeight-height*height));
        float area=(float)(Math.PI*r*r);
        float TotalPrice=area*rate;
        System.out.println("Total cost polishing the base of a cone:"+TotalPrice);

    }
}
