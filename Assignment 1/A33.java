class A33 {
    public static void main(String args[]){
        int lenghtGarden=30;
        int widthGarden=20;
        int TotalAreaGarden=lenghtGarden*widthGarden;
        int AreaFirstPath=lenghtGarden*3;
        int AreaSecondPath=widthGarden*4;
        int OverlapArea=3*4;
        int TotalPathArea=AreaFirstPath+AreaSecondPath-OverlapArea;
        int useArea=TotalAreaGarden-TotalPathArea;
        System.out.println("Total usable area of garden:"+useArea);


    }
}
