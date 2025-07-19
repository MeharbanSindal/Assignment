import java.util.Scanner;
class A5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Person Age :");
        int A=sc.nextInt();

        System.out.println("Enter 2nd Person Age :");
        int B=sc.nextInt();

        System.out.println("Enter 3rd Person Age :");
        int C=sc.nextInt();

        if(A>=B && A>=C){
            System.out.println("Person A is older.");
        }
        else if(B>=A && B>=C){
            System.out.println("Person B is older.");
        }


        else{
            System.out.println("Person C is older.");
        }

        if(A<=B && A<=C){
            System.out.println("Person A is Younger.");
        }
        else if(B<=A && B<=C){
            System.out.println("Person B is Younger.");
        }


        else{
            System.out.println("Person C is Younger.");
        }
    }
}