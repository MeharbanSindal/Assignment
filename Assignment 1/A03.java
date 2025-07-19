/*
    How many tiles whose length and breadth are 13 cm and 7cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140cm?

 */

class A3{
    public static void main(String args[]){
        int TilesLength=13;
        int TilesBreadth=7;
        int AreaOfTiles=TilesLength*TilesBreadth;
        int AreaOfRegion=520*140;
        int ReqTiles=AreaOfRegion/AreaOfTiles;
        System.out.println("Reqiured tiles is :"+ReqTiles);
    }
}