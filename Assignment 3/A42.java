import java.util.Scanner;
class A42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary:");
        double basicSalary = sc.nextDouble();

        double hra, da;

        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da  = 0.80 * basicSalary;
        } 
        
        else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da  = 0.90 * basicSalary;
        } 
        
        else {
            hra = 0.30 * basicSalary;
            da  = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary = " + grossSalary);

    }
}

