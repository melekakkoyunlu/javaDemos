package Password;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        String userName , password;
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        userName = input.nextLine();
        System.out.println("Password:");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123") ){
            System.out.println("Entered succesfully.");

        }else{
            System.out.println("Invalid info.");
        }


    }
}
