package EtkinlikOneri;
import java.util.Scanner;
public class EtkinlikOneri {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter heat:");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak");
        } else if(heat >=5 && heat<=25){
              if(heat <=15){
                System.out.println("Cinema");
              }
              if(heat>=10){
                 System.out.println("Picnic");
              }
        } else{
            System.out.println("Swimming");
        }

    }
}
