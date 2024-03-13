import java.util.Scanner;
class Services{
    int amount = 100000;
    int withdrawlAmount;
    int pinNumber;
    int depositAmount;
    void withdrawlAmount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdrawl:");
        int withdrawlAmount = s.nextInt();
        System.out.println(("Enter your 4 digit pin number:"));
        pinNumber = s.nextInt();
        if(pinNumber==1901){
            System.out.println("You have entered the correct pin");
            System.out.println("Please wait while we are processing your request...");
            if(withdrawlAmount<=amount){
            System.out.println("The amount withdrawl successfully");
            int amountLeft = amount-withdrawlAmount;
            System.out.println("The amount left after the withdrawl:"+amountLeft);
            }
            else{
                System.out.println("You have not sufficient balance");
            }
            
        }
        else{
            System.out.println("You have entered the wrong pin");
        }
        
    }
    void balanceCheck(){

        Scanner sp = new Scanner(System.in);
        System.out.println("Enter your 4 digit pin:");
        pinNumber = sp.nextInt();
        if(pinNumber==1901){
            System.out.println("You have entered the correct pin");
            System.out.println("Please wait while fetching your bank balance..");
            System.out.println("The balance amount left on your account:"+amount);
    }
        else{
            System.out.println("You have entered the wrong pin");
        }
    }
    void depositAmount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        int depositAmount = s.nextInt();
        System.out.println(("Enter your 4 digit pin number:"));
        pinNumber = s.nextInt();
        if(pinNumber==1901){
            System.out.println("You have entered the correct pin");
           System.out.println("Please wait while we are processing your request...");
            System.out.println("The amount is deposited successfully");

            int amountLeft = amount+depositAmount;
            System.out.println("The amount left after the withdrawl:"+amountLeft);
        }
        else{
            System.out.println("You have entered the wrong pin");
        }
    }
}


public class Atm {
    public static void main(String[] args) {
        System.out.println("*****ATM Services*****");
        System.out.println("1.Withdrawl");
        System.out.println("2.Balance Check");
        System.out.println("3.Deposit");
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
        System.out.print("Enter the choice for service you need: ");
        int choice = sc.nextInt();
        Services s1 = new Services();
        if(choice==1){
            s1.withdrawlAmount();
        }
        else if(choice==2){
            s1.balanceCheck();
        }
        else if(choice==3){
             s1.depositAmount();
        }
        
        else{
            System.out.println("Invalid choice!");
        }
         System.out.println("Would you like to continue on our services(y/n):");
        String input = sc.next();
        isRunning = (input.equalsIgnoreCase("y"));
    }
        
    }
    
}
