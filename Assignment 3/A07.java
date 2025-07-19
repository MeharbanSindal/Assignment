import java.util.Scanner;
class A7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Total Class:");
        int TotalClass=sc.nextInt();

        System.out.println("Enter Attend class:");
        int AttendClass=sc.nextInt();

        double Percentage=(AttendClass*100)/TotalClass;

        System.out.println("Attend Class Percentage:"+Percentage+"%");

        if(Percentage>=75){
            System.out.println("You Allow to sit in Exam.");
        }

        else{
            System.out.println("You do not Allow to sit in Exam.");
        }
    }
}
