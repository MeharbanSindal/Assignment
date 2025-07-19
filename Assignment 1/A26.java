/*
    How many bricks will be required to lay a path 120m long and 2.4m breadth if a brick in 24cm long and 15cm wide?
*/ 


class A26 {
    public static void main(String args[]){
        int BrickLength=24;
        int BrickWide=15;

        int PathLength=120*100;
        float PathWide=(float)(2.4*100);
        float AreaOfPath=(float)(PathLength*PathWide);
        double OneBrickArea=BrickLength*BrickWide;
        double TotalBricks=AreaOfPath/OneBrickArea;
        System.out.println("Total number of bricks are:"+TotalBricks);

    }
}
