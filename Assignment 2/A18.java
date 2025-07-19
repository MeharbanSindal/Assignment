import java.util.Scanner;
class A18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Lenght Of Park:");
        int lenght=sc.nextInt();

        System.out.println("Enter Width Of Park:");
        int width=sc.nextInt();


        System.out.println("Enter Round Of Park:");
        int Round=sc.nextInt();
        int perimeter=2*(lenght+width);
        double round =Round*perimeter;
        double km=round/1000;
        System.out.println("Distance is"+km);
    }
}
