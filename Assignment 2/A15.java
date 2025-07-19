import java.util.Scanner;
class A15 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Shelly Garden Length:");
        int SgardenLenght=sc.nextInt();

        System.out.println("Enter Shelly Garden Width:");
        int SgardenWidth=sc.nextInt();

        System.out.println("Enter Rachel Garden Length:");
        int RgardenLength=sc.nextInt();

        System.out.println("Enter Rachel Garden Width:");
        int RgardenWidth=sc.nextInt();
        int RachelGardenArea=RgardenLength*RgardenWidth;
        int ShellyGardenArea=SgardenLenght*SgardenWidth;
        int Bigger=RachelGardenArea-ShellyGardenArea;
        System.out.println("Rachel Garden is bigger much:"+Bigger);

    }
}
