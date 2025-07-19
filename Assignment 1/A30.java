/*
    How many tiles of length 5cm and breadth 8cm are needed to tile the floor of a bed room 200cm long and 400cm wide.
*/ 


class A30 {
    public static void main(String args []){
        int BedroomLength=200;
        int BedroomWide=400;
        int AreaOfBedroom=BedroomLength*BedroomWide;
        int TileLength=5;
        int TileWidth=8;
        int AreaTiles=TileLength*TileWidth;
        int TotalTiles=AreaOfBedroom/AreaTiles;
        System.out.println("Total tiles are:"+TotalTiles);

    }
}
