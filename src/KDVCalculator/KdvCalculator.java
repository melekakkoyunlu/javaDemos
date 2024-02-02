package KDVCalculator;
import java.util.*;

public class KdvCalculator {
    public static void main(String[] args) {

        double input,kdv;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount:");
        input=scanner.nextDouble();
        if(input>=0 && input<1000){
            kdv=1.18;
            System.out.println("\nTotal is ="+ (input*kdv));
        } else if (input>=1000) {
            kdv=1.08;
            System.out.println("\nTotal is ="+ (input*kdv));
        }else {
            System.out.println("\nInvalid input");
        }


    }
}
