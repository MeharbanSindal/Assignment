import java.util.Scanner;
class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num=sc.nextInt();

        if(num<0){
            num=-num;
        }
        System.out.println("Absolute Value:"+num);
    }
}
