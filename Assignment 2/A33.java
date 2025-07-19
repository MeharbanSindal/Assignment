import java.util.Scanner;
class A33 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Garden Lenght:");
        int lenghtGarden=sc.nextInt();

        System.out.println("Enter Garden Width:");
        int widthGarden=sc.nextInt();

        System.out.println("Enter One Pathway Width:");
        int Pwidth=sc.nextInt();

        System.out.println("Enter Other Pathway Width:");
        int P2width=sc.nextInt();

        

        int TotalAreaGarden=lenghtGarden*widthGarden;
        int AreaFirstPath=lenghtGarden*Pwidth;
        int AreaSecondPath=widthGarden*P2width;
        int OverlapArea=Pwidth*P2width;
        int TotalPathArea=AreaFirstPath+AreaSecondPath-OverlapArea;
        int useArea=TotalAreaGarden-TotalPathArea;
        System.out.println("Total usable area of garden:"+useArea);
    }

}