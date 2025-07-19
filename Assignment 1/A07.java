/*
    Find the heigth of a tringle whose base is 50cm and whose area is 500 cm^2.
Area = (1/2) * base * height 
height = (2 * Area) / base 
height = (2 * 500 ) / 50
height = 1000/ 50
height = 20
 */

class A7 {
    public static void main(String[] args) {
        int AreaTringle=500;
        int BaseTringle=50;
        int HeightTringle=(2*AreaTringle)/BaseTringle;
        System.out.println(HeightTringle);
    }
}
