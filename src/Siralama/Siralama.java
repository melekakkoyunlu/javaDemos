package Siralama;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int num1 , num2, num3 , temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integer:");
        num1=input.nextInt();num2=input.nextInt();num3=input.nextInt();

        temp= num1;
        if(temp<=num2 && num2>=num3){
            temp=num2;
        } else if (temp<=num3 && num2<=num3) {
            temp =num3;
        }else{
            temp=num1;
        }
        System.out.println("Biggest:" + temp);

    }
}
