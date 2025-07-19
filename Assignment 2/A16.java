import java.util.Scanner;
class A16 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length of Dinning Room:");
        int lenght=sc.nextInt();

        System.out.println("Enter Width of Dinning Room:");
        int width=sc.nextInt();

        int AreaOfDining=lenght*width;
        System.out.println("Tina need carpet:"+AreaOfDining);
    }    
}