package ATM;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String userName , password;
        int right=3 , operation;
        int balance = 1500;
        Scanner scan = new Scanner(System.in);


        while(right>0){
            System.out.println("Enter your username:");
            userName= scan.nextLine();
            System.out.println("Enter your password:");
            password= scan.nextLine();
            if(userName.equals("admin0")&&password.equals("dev123")){
                System.out.println("Hello," + userName);
                do{
                    System.out.println("Choose operation:" +
                            "\n 1- Deposit Money " +
                            "\n 2- Withdraw Money " +
                            "\n 3- Balance" +
                            "\n 4- Exit");
                     operation = scan.nextInt();
                     switch (operation){
                         case 1:
                             System.out.println("Enter amount:");
                             int amount = scan.nextInt();
                             balance+=amount;
                             break;
                         case 2:
                             System.out.println("Enter amount:");
                             int amount_ = scan.nextInt();
                             if(amount_>balance){
                                 System.out.println("Insufficient funds.");
                             }else{
                                 balance-=amount_;
                             }
                             break;
                         case 3:
                             System.out.println("Balance : "+ balance);
                            break;

                     }

                }while(operation!=4);
                System.out.println("Goodbye.");
                break;

            }else{
                System.out.println("Invalid username or password. \n Remaining right:"+ --right);
                if(right==0){
                    System.out.println("Account blocked.");
                }
            }
        }




    }
}
