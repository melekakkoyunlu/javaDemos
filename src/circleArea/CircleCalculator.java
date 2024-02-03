package circleArea;
import java.lang.Math;
import java.util.*;
public class CircleCalculator {
    public static void main(String[] args) {
        int r ,a;
        final double pi = 3.14 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        r = input.nextInt();
        System.out.println("Enter center angle:");
        a = input.nextInt();

        double area = pi * Math.pow(r,2);
        double perimeter = ((pi*Math.pow(r,2)*a)/360);

        System.out.println("The circle with radius "+ r +" and center angle "+ a + " ,its area is " + area + " and perimeter is "+ perimeter+" .");
    }
}
