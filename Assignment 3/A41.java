import java.util.Scanner;
class A41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks Biology: ");
        int biology = sc.nextInt();

        System.out.print("Enter marks Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks Computer: ");
        int computer = sc.nextInt();

        int totalMarks = physics + chemistry + biology + math + computer;
        double percentage = totalMarks / 5.0;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } 
        
        else if (percentage >= 80) {
            grade = 'B';
        } 
        
        else if (percentage >= 70) {
            grade = 'C';
        } 
        
        else if (percentage >= 60) {
            grade = 'D';
        } 
        
        else if (percentage >= 40) {
            grade = 'E';
        } 
        
        else{
            grade = 'F';
        }

        System.out.println("Grade is:" + grade);

    }
}
