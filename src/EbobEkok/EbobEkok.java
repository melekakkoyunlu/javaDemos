package EbobEkok;
import java.util.Scanner;

public class EbobEkok {

    public static int Ebob(int num1, int num2) {
        int result = 1, divider = 1;

        while (divider <= num1 && divider <= num2) {
            if (num1 % divider == 0 && num2 % divider == 0) {
                result = divider;
            }
            divider++;
        }
        return result;
    }

    public static int Ekok(int num1 , int num2){
        return ((num1 * num2 )/Ebob(num1,num2));
    }

    public static void main(String[] args) {
        int num1 , num2 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 =  scan.nextInt();
        System.out.println("Enter the second number:");
        num2=  scan.nextInt();

        System.out.println("Ebob = " +Ebob(num1,num2));
        System.out.println("Ekok = " +Ekok(num1,num2));

    }
}
