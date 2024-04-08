package UcakBileti;
import java.util.*;

public class UcakBiletiHesaplama {

    static double Hesapla(int km , int age){
        double total=km*0.10;
        if(age<12){
            return (total*0.5);
        }
        else if (age>12 && age<24) {
            return (total*0.90);
        } else if (age>65) {
            return (total*0.70);
        }
        return total;
    };
    public static void main(String[] args) {
        int km,age,t;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        t = input.nextInt();

        if(km>0 && age>0 && (t==1 || t==2) ){
        switch (t){
            case 1:
                total =  Hesapla(km,age);
                System.out.println("Toplam Tutar =" + total + " TL");
                break;
            case 2:
                total = Hesapla(km,age)* 2 * 0.8;
                System.out.println("Toplam Tutar =" + total + " TL");
                break;
        }

        }else{
            System.out.println("Invalid value.");
        }

    }

}
