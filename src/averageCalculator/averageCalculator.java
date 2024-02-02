package averageCalculator;
import java.util.*;

public class averageCalculator {
    public static void main(String[] args) {
        int gPhy , gChem , gTur , gHis , gMs ,gMath;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mathematics Grade:");
        gMath = input.nextInt();
        System.out.println("Enter Physics Grade:");
        gPhy = input.nextInt();
        System.out.println("Enter Chemistry Grade:");
        gChem = input.nextInt();
        System.out.println("Enter History Grade:");
        gHis = input.nextInt();
        System.out.println("Enter Music Grade:");
        gMs = input.nextInt();
        System.out.println("Enter Turkish Grade:");
        gTur = input.nextInt();
        double average = (double)((gMath+gHis+gChem+gTur+gPhy+gMs)/6.0);
        System.out.println("Your average is:"+average);

        String str1 , str2 ;
        str1 = "You have passed.";
        str2 = "You failed.";
        System.out.println((average>=60)? str1:str2);
    }
}
