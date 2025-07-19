/*
    the length of one of the diagonals of a field in the form of a quadrilateral in 46m.The perpendicular distance of the other two vertices from the diagonal are 13m and and 10m,find the area of the field.
*/ 


class A14 {
    public static void main(String args[]){
        int LengthOfOneDiagonal=46;
        int d1=13;
        int d2=10;
        double Area=(double)(0.5*LengthOfOneDiagonal*(d1+d2));
        System.out.println("Area of the Quadrilateral is:"+Area);

    }
}
