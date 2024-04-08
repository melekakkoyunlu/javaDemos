package Toplama2;
import java.util.*;
public class Toplama2 {
    public static void main(String[] args) {
        int i=0,result=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter nums (Enter odd number to execute.):");

        while(i%2==0 || i==2){
            i = input.nextInt();
            if(i%4==0){
                result+=i;
            }
        }
        System.out.println(result);
    }
}
