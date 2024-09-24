package PerfectNums;

import java.util.Scanner;

public class PerfectNums {

    public static int Func(int num){
        int result =0 ;
        for(int i=1 ; i < num ; i++){
            if(num % i == 0){
                result += i ;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        int num = scan.nextInt();

        String message ;

        message = (num == Func(num)) ? "Perfect number." : "Not a perfect number.";
        System.out.println(message);
    }
}
