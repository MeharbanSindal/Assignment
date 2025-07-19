/*
    the area of a rectangle is 96cm^2.if the breadth of the rectangle is 8cm,find its length and perimeter

    perimeter of rec=2*(l+b)

    area=l*b

    96/8=l
    l=12

 */




class A2{
    public static void main(String[] args) {
        int RecArea=96;
        int RecBreadth=8;
        int RectLength=RecArea/RecBreadth;
        int RecPerimeter=2*(RectLength+RecBreadth);
        System.out.println("Rectangle length is:"+RectLength);
        System.out.println("Rectangle perimeter is:"+RecPerimeter);
    }
}
