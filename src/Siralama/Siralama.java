package Siralama;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integer:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);

            } else {
                System.out.println(b + " " + c + " " + a);

            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(c + " " + a + " " + b);

            } else {
                System.out.println(a + " " + c + " " + b);

            }

        } else if ((c > a) && (c > b)) {

            if (a > b) {
                System.out.println(b + " " + a + " " + c);

            } else {
                System.out.println(a + " " + b + " " + c);

            }

        }
    }
}
