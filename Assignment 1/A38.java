class A38 {
    public static void main(String[] args) {
        int Volume=1287;
        int radius=10;
        float h=(float)(Volume/(3.14*radius*radius));
        float Surface=(float)(2*3.14*radius*(radius+h));
        System.out.println("Surface of the cylinder:"+Surface);
    }
}
