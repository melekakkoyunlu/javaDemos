package UsluSayilar;

import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total=1;
        System.out.println("Enter base:");
        int i = input.nextInt();
        System.out.println("Enter exponent:");
        int j = input.nextInt();

        for(int k=0;k<j;k++){
            total *=i;
        }
        System.out.println(total);
    }
}
