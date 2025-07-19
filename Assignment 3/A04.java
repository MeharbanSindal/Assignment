import java.util.Scanner;
class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Marks...:");
        double marks=sc.nextDouble();

        if(marks<25){
            System.out.println("Grade: F");
        }

        else if(marks>=25 && marks<45){
            System.out.println("Grade: E");
        }

        else if(marks>=45 && marks<50){
            System.out.println("Grade: D");
        }

        else if(marks>=50 && marks<60){
            System.out.println("Grade: C");
        }

        else if(marks>=60 && marks<=80){
            System.out.println("Grade: B");
        }

        else if(marks>80 && 100>=marks){
            System.out.println("Grade: A");
        }


        else{
            System.out.println("Please Eneter a Valid Marks......");
        }

    }
}
