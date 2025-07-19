import java.util.Scanner;
class A18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks Mathematics: ");
        double maths = sc.nextDouble();

        System.out.print("Enter marks Science:");
        double science = sc.nextDouble();

        System.out.print("Enter marks Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks Hindi: ");
        double hindi = sc.nextDouble();

        double totalNumber = maths + science + physics + chemistry + hindi;
        double percentage = totalNumber / 5;

        System.out.println("Total Marks: " + totalNumber);
        System.out.println("Percentage: " + percentage + "%");

    }
}

