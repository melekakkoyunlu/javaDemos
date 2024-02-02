package hypoCalc;

import java.util.*;
import java.lang.Math;
public class hipotenusCalc {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("First side:");
        a = scanner.nextInt();
        System.out.print("\nSecond side:");
        b = scanner.nextInt();
        System.out.print("\nThird side:");
        c = scanner.nextInt();
       double u =(a + b + c)/2;
        System.out.println("\nArea is:" + Math.sqrt(u*(u-a)*(u-b)*(u-c)));



    }



}
