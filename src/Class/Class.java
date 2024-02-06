package Class;
import java.util.Scanner;
public class Class {
    public static void main(String[] args) {
        int mat , fizik , _Turkce , kimya , muzik ;
        double average ;
        Scanner input = new Scanner(System.in);

        System.out.println("Mat:");
        mat = input.nextInt();
        System.out.println("Turkce:");
        _Turkce = input.nextInt();
        System.out.println("Kimya:");
        kimya = input.nextInt();
        System.out.println("Fizik:");
        fizik = input.nextInt();
        System.out.println("Muzik:");
        muzik = input.nextInt();

        average = ((mat+fizik+kimya+muzik+_Turkce)/5);

        if(average <=55){
            System.out.println("Failed.\n Average: " + average);
        }else {
            System.out.println("Passed.\n Average: " + average);;
        }
    }


}
