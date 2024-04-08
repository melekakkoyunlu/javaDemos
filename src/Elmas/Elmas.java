package Elmas;
import java.util.*;
public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();
        int bosluk = n - 1;
        int yildiz = 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            bosluk--;
            for (int k = 0; k < yildiz; k++) {
                System.out.print("*");
            }
            yildiz += 2;
            System.out.println("");

        }

        bosluk = 0;
        yildiz = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            bosluk++;
            for (int k = 0; k < yildiz; k++) {
                System.out.print("*");
            }
            yildiz -= 2;

            System.out.println("");
        }
    }
}
