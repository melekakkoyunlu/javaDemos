package BmiCalculator;
import java.util.Scanner;
public class bmiCalculator {
    public static void main(String[] args) {
        double height , kg , bmi;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in meters: ");
        height= input.nextDouble();
        System.out.println("Enter your weight in kilogram: ");
        kg= input.nextDouble();
        bmi = (kg/(height*height));
        System.out.println("Your BMI : "+bmi);

    }
}
