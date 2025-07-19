class A43 {
    public static void main(String[] args) {
        int height=4;
        int SlantHeight=5;
        int rate=10;
        float r=(float)(Math.sqrt(SlantHeight*SlantHeight-height*height));
        float area=(float)(Math.PI*r*r);
        float TotalPrice=area*rate;
        System.out.println("Total cost polishing the base of a cone:"+TotalPrice);

    }
}
