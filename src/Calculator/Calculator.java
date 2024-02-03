package Calculator;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        int num1 , num2 , select ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        num1 = input.nextInt();
        System.out.println("Enter the second integer:");
        num2 = input.nextInt();

        System.out.println(" 1->Addition \n 2->Extraction \n 3->Multiplication \n 4->Division ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid input.");
        }


    }
}
