package Account;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class AccountOperation extends Account{

    Scanner sc = new Scanner(System.in);
    float bankBalance;

    public AccountOperation(String name, String address, String emailID, long phoneNumber, long accountNumber) {
        super(name, address, emailID, phoneNumber, accountNumber);
    }

    Boolean validate(){
        Long validateAccountNumber ;
        System.out.println("Please enter your account number : ");
        validateAccountNumber = sc.nextLong();
        boolean status = false;
        try {
            if(validateAccountNumber != accountNumber){
                status = false;
                throw  new AccountNotFoundException();
            }
            else
                status = true;
        } catch (AccountNotFoundException e) {
            System.out.println(e);
        }
        return status;
    }

    void addAccount(){
        System.out.println("Please enter your name : ");
        name = sc.nextLine();
        System.out.println("Please enter your address : ");
        address = sc.nextLine();
        System.out.println("Please enter your emailID : ");
        emailID = sc.nextLine();
        System.out.println("Please enter your phonenumber : ");
        phoneNumber = sc.nextLong();
        Random random = new Random();
        accountNumber = random.nextInt(1000000000)*1000l;
    }

    void deposit(){
        validate();
        float depositAmount=0;
        System.out.println("Enter the amount you want to deposit :");
        depositAmount = sc.nextFloat();
        bankBalance += depositAmount;
        System.out.println( depositAmount + " has been deposited\n Updated Bank Balance is :  " +bankBalance);
    }

    void withdraw(){
       float withdrawAmount = 0f;
       validate();
       System.out.println("Please enter amount you want to withdraw : ");
       withdrawAmount = sc.nextFloat();
       bankBalance -= withdrawAmount;
        System.out.println( withdrawAmount + " has been withdraw\n Updated Bank Balance :  "+ bankBalance);
    }

    void displayDetails(){

    }




}
