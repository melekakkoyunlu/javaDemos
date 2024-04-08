package Combination;

import java.util.Scanner;

public class Combination {
    public static int Factorial(int i){
        if(i>1){
            return (i*Factorial(i-1));
        } else if (i==1) {
            return 1;
        }
        return i;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value:");
        int i = scanner.nextInt();
        System.out.println("Enter second value:");
        int j = scanner.nextInt();

        int result = Factorial(i)/(Factorial(j)*Factorial((i-j)));
        System.out.println(result);


    }
}
