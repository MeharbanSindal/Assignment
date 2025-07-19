/*
    shelly has a rectanular garden of lenght 22m and breadth 15m.her friend rachel has a square garden of side 21m
    whose garden is bigger and by how much
*/ 


class A15 {
    public static void main(String args []){
        int SgardenLenght=22;
        int SgardenWidth=15;
        int ShellyGardenArea=SgardenLenght*SgardenWidth;
        int RachelGardenArea=21*21;
        int Bigger=RachelGardenArea-ShellyGardenArea;
        System.out.println("Rachel Garden is bigger much:"+Bigger);

    }
}
