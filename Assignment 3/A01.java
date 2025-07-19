import java.util.Scanner;
class A1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Lenght of Rectangle:");
        int Lenght=sc.nextInt();


        System.out.println("Enter the Breadth of Rectangle:");
        int Breadth=sc.nextInt();

        if(Lenght==Breadth){
            System.out.println("It is a Square.");
        }
        else{
            System.out.println("It is a not Square.");
        }


    }
}