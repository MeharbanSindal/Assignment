class A34 {
    public static void main(String args[]){
        int b1=128;
        int b2=92;
        int height=40;
        float AreaOfTropezoid=(float)((b1+b2)*height)/2;
        int lenWalkAway=height,widthWalkAway=4,walkAwayArea=lenWalkAway*widthWalkAway;
        float WoodArea=(float)(AreaOfTropezoid-walkAwayArea);
        System.out.println("Area of Tropezoid:"+AreaOfTropezoid);
        System.out.println("Area of Walk Away:"+walkAwayArea);
        System.out.println("Area of Wood:"+WoodArea);
    }    
}
