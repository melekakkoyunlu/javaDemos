package HarmonicNumbers;

import java.util.Scanner;

public class HarmonicCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value:");
        int n = scan.nextInt();
        double res = 0.0;

        for(int i=1;i<=n;i++){
            res += ((double) 1 /i);
        }
        System.out.println(res);
    }
}
