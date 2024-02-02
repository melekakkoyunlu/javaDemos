package TaxiCalculator;
import java.util.*;
public class TaxiCalculator {
    public static void main(String[] args) {
        int km;
        double total=0.0 ;
        final double openingFee =10.0 , pricePerKm=2.20;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter km:");
        km = input.nextInt();

        total =  openingFee + (km*pricePerKm);
        total =  (total<20)? 20:total;

        System.out.println("Total is "+total+" TL.");

    }
}
