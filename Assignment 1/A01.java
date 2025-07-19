/*

Q:the perimeter of rectangle is 230 cm.if the rectangle is 70 cm, find its breadth and area?


area of perimeter=2*(l+b)
230=2*(70+b)
230/2=70+b
115-70=b
45

area=length*width
*/ 




class A1{
    public static void main(String args[]){
        int RecPerimeter=230;
        int RectLength=70;
        int Rectbreadth=(RecPerimeter/2)-RectLength;
        int RecArea=RectLength*Rectbreadth;
        System.out.println("Breadth of a Rectangle is:"+Rectbreadth);
        System.out.println("Area of a Rectangle is:"+RecArea);

    }
}