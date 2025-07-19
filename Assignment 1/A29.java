/*
    how many square tiles of side 10cm will be required to tile a floor measuring 800cm by 900cm.
*/ 


class A29 {
    public static void main(String args []){
        int AreaOfFloor=800*900;
        int TilesSide=10*10;
        int TotalTiles=AreaOfFloor/TilesSide;
        System.out.println("Tital number of tiles:"+TotalTiles);
    }
}
