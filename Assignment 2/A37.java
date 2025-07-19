import java.util.Scanner;
class A37 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter surface of Cylinder:");
        float surface=sc.nextFloat();

        System.out.println("Enter Height of Cylinder:");
        float height=sc.nextFloat();
        
        float diameter=(float)(2*(Math.sqrt(height*height+2*(surface/3.14))-height)/2);
        System.out.println("Diameter of cylinder is:"+diameter);
    }
}
