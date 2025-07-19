import java.util.Scanner;
class A3 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Salary:");
        double Salary=sc.nextDouble();


        System.out.println("Enter Your Year of Service:");
        int Year=sc.nextInt();

        if(Year>5){
            double bonus=Salary*5/100;
            System.out.println("Your Bonus is:"+bonus);
        }
        else{
            System.out.println("No bonus.");
        }
    }
}
