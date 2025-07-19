import java.util.Scanner;

class A22 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lenght Of Pond:");
        int pondLenght=sc.nextInt();

        System.out.println("Enter the Width Of Pond:");
        int pondWidth=sc.nextInt();

        System.out.println("Enter the Deep Of Pond:");
        int pondDeep=sc.nextInt();

        int Capacity=pondLenght*pondWidth*pondDeep;
        System.out.println("Capacity is:"+Capacity);
    }
}
