class A23 {
    public static void main(String args[]){
        int cubeSide=3;
        int CubicalVolume=cubeSide*cubeSide*cubeSide;
        int VolumeOfCarton=15*9*12;
        int NumberOfBox=VolumeOfCarton/CubicalVolume;
        System.out.println("Number of Box is:"+NumberOfBox);
    }    
}
