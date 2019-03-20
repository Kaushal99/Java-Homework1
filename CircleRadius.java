import java.awt.geom.PathIterator;

public class CircleRadius
{
    //Calculate area of circle for given radius 5
    //area = PI(r*r)
    static int r = 5;  //Circle radius is static variable
    static final double PI = 3.14; //Circle area value is fix

    //Java main method
    public static void main(String[] args)
    {
        System.out.println("Area of Circle");
        System.out.println(PI*r*r); //using the formula of area of circle
    }
}