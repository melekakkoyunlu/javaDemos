package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int input ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        input = scan.nextInt();

        int res1 = 0, res2 = 1;

        System.out.print("Fibonacci Serisi: " + res1 + " " + res2);

        for (int i = 2; i < input; i++) {
            int next = res1 + res2;
            System.out.print(" " + next);

            res1 = res2;
            res2 = next;
        }
    }
}
