import java.util.Scanner;
public class A11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter sex (M or F): ");
        char sex = sc.next().charAt(0);

        System.out.print("Enter marital status (Y or N): ");
        char maritalStatus = sc.next().charAt(0);

        if (sex == 'F' || sex == 'f') {
            System.out.println("She will work only in urban areas.");
        } 

        else if ((sex == 'M' || sex == 'm') && (age >= 20 && age <= 40)) {
            System.out.println("He may work anywhere.");
        } 
        
        else if ((sex == 'M' || sex == 'm') && (age > 40 && age <= 60)) {
            System.out.println("He will work only in urban areas.");
        } 
        
        else {
            System.out.println("ERROR");
        }
    }
}
