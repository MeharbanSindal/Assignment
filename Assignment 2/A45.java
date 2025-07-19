import java.util.Scanner;
class A45 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The First Term:");
        int a =sc.nextInt();

        System.out.println("Enter The Difference:");
        int d=sc.nextInt();

        System.out.println("Enter The nth Term:");
        int n=sc.nextInt();
        int Ap=(n*(2*a+(n-1)*d))/2;
        System.out.println("sum of the AP is:"+Ap);
    }    
}