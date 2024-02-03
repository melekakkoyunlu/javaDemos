package ManavKasaProgram;
import java.util.*;
public class ManavKasaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double pPear=2.14 , pApple = 3.67 , pTomato = 1.11 , pBanana = 0.95 , pAubergine = 5.00;
        double kgPear,kgApple,kgTomato,kgBanana,kgAubergine , total;

        System.out.println("Kg of Pear:");
        kgPear = input.nextDouble();
        System.out.println("Kg of Apple:");
        kgApple = input.nextDouble();
        System.out.println("Kg of Tomato:");
        kgTomato = input.nextDouble();
        System.out.println("Kg of Banana:");
        kgBanana = input.nextDouble();
        System.out.println("Kg of Aubergine:");
        kgAubergine = input.nextDouble();

        total = ((kgPear*pPear)+(kgApple*pApple)+(kgTomato*pTomato)+(kgBanana*pBanana)+(kgAubergine*pAubergine));

        System.out.println("Total is " + total + " TL.");


    }
}
