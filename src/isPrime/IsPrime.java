package isPrime;

import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int num,int x){
        if(num <= 1){
            return false;
        } else if (x >= num) {
            return true;
        } else if (num % x == 0) {
            return false;
        }
        return isPrime(num,(x+1));
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = scan.nextInt();

        if (isPrime(num,2)){
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
