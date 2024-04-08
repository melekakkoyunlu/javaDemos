package ArtikYil;
import java.util.*;
public class ArtikYilCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz:");
        int year = input.nextInt();

        if(year%100==0 && year%400==0){
            System.out.println("\n Artik yildir.");
        } else if (year%100!=0 && year%4==0 ) {
            System.out.println("\n Artik yildir.");
        }
        else {
            System.out.println("\n Artik yil degildir.");
        }

    }
}
