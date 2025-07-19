import java.util.Scanner;
class A44 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Term:");
        int a=sc.nextInt();

        System.out.println("Enter the Difference:");
        int d=sc.nextInt();

        System.out.println("Enter nth Term:");
        int n=sc.nextInt();
        
        int Ap=a+(n-1)*d;
        System.out.println("Term of the 28Th of AP is:"+Ap);
    }    
}
