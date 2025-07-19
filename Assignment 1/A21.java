class A21 {
    public static void main(String args[]){
        int wallLenght=15*100;
        int wallbreadth=10*100;
        int wallheight=8*100;
        int VolumeOfBrick=15*8*5;
        int VolumeOfWall=wallLenght*wallbreadth*wallheight;
        int TotalBrick=VolumeOfWall/VolumeOfBrick;
        System.out.println("Total brick inside a wall:"+TotalBrick);

    }    
}
