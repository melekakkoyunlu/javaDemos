package BolunenToplama;
import java.util.Scanner;

public class Toplama {
    public static void main(String[] args) {
        int total=0 , k=-1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the num:");
        int inp = input.nextInt();

        for(int i=0;i<inp;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                k++;
            }
        }
        System.out.println("Average is " + (total/k));


    }
}
