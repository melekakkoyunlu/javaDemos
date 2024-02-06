package BurcBulma;
import java.util.Scanner;
public class BurcBulur {
    public static void main(String[] args) {
        String month;
        int day;
        Scanner input = new Scanner(System.in);

        System.out.println("Dogum tarihi: ");
        day = input.nextInt();
        month = input.nextLine();
        month = month.toLowerCase();

        if(month.equals("ocak")){
            if(day<21)
                System.out.println("oglak");
            else
                System.out.println("kova");
        } else if (month.equals("subat")) {
            if(day<19)
                System.out.println("kova");
            else
                System.out.println("balik");

        }else if (month.equals("mart")) {
            if(day<20)
                System.out.println("balik");
            else
                System.out.println("koc");

        }else if (month.equals("nisan")) {
            if(day<20)
                System.out.println("koc");
            else
                System.out.println("boga");

        }else if (month.equals("mayis")) {
            if(day<21)
                System.out.println("boga");
            else
                System.out.println("ikizler");

        }else if (month.equals("haziran")) {
            if(day<22)
                System.out.println("ikizlar");
            else
                System.out.println("yengec");

        }else if (month.equals("temmuz")) {
            if(day<22)
                System.out.println("yengec");
            else
                System.out.println("aslan");

        }else if (month.equals("agustos")) {
            if(day<22)
                System.out.println("aslan");
            else
                System.out.println("basak");

        }else if (month.equals("eylul")) {
            if(day<22)
                System.out.println("basak");
            else
                System.out.println("terazi");

        }else if (month.equals("ekim")) {
            if(day<22)
                System.out.println("terazi");
            else
                System.out.println("akrep");

        }else if (month.equals("kasim")) {
            if(day<21)
                System.out.println("akrep");
            else
                System.out.println("yay");

        }else if (month.equals("aralik")) {
            if(day<21)
                System.out.println("yay");
            else
                System.out.println("oglak");

        }


    }
}

