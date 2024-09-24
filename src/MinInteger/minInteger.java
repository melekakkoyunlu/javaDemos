package MinInteger;

import java.util.Scanner;

public class minInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 1;
        System.out.println("Kaç sayı gireceksiniz?");
        num = scan.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int num1 = scan.nextInt();
        int max = num1;
        int min = num1;

        for (int i = 2; i <= num; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num1 = scan.nextInt();

            if (num1 > max) {
                max = num1;
            }

            if (num1 < min) {
                min = num1;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
