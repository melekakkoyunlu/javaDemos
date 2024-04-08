package KuvvetYazdirma;
import java.util.*;
public class KB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num ");
        int i = input.nextInt();

        for(int j=1;j<i;j*=4){
            System.out.println(j);
        }
        for(int j=1;j<i;j*=5){
            System.out.println(j);
        }

    }
}
