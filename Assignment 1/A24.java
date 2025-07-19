class A24 {
    public static void main(String args []){
        int wallLenght=20*100;
        int wallHeight=2*100;
        double wallThick=0.75*100;
        double brickLenght=25;
        double brickWidth=10;
        double brickThick=7.5;
        double VolumeOneBrick=brickLenght*brickWidth*brickThick;
        double VolumeOfWall=wallLenght*wallHeight*wallThick;
        double NumberOfBricks=VolumeOfWall/VolumeOneBrick;
        double TotalCost=NumberOfBricks*900/1000;
        System.out.println("Total cost of bricks is:"+TotalCost);

    }
}
