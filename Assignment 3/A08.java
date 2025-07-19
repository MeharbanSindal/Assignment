import java.util.Scanner;
class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter he/she has a medical cause (Y/N)?:");
        char MedicalCause = sc.next().charAt(0);

        if (MedicalCause == 'Y' || MedicalCause == 'y') {
            System.out.println("You are allowed to sit in the exam.");
        } 
        else {
            System.out.println("Enter your attendance percentage:");
            double percentage = sc.nextDouble();

            if (percentage >= 75) {
                System.out.println("You Allow to sit in Exam.");
            } 
            else {
                System.out.println("You do not Allow to sit in Exam.");
            }
        }

    }
}


