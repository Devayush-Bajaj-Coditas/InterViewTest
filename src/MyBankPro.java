import java.util.Random;
import java.util.Scanner;

class MyBankOperations {
    float bankBalance;
    int user_selection;
    String name, address;
    long phone_no, account_no;
    Scanner scannerInput = new Scanner(System.in);
    void menu_Input_From_User() {
        System.out.println("How may I help you :- ");
        System.out.println("0) Exit\n" +
                "1) Add a bank account - Type Current / Savings [accountType]\n" +
                "2) Deposit amount\n" +
                "3) WWithdraw amount\n" +
                "4) Display all account details\n Enter: ");
        user_selection = scannerInput.nextInt();
    }

    void bank_operations() {
        //while (user_selection == 0) {
            switch (user_selection) {
                case 0:
                    System.out.println("Thank you for using our services");
                    user_selection = 7;
                    break;

                case 1:     //Add a bank account
                    System.out.println("Press 1 for Savings account \nPress 2 for Current account : ");
                    int user_Choice = scannerInput.nextInt();

                    if (user_Choice == 1) {
                        System.out.println("Enter your name : ");
                        name = scannerInput.next();
                        System.out.println("Enter your Address : ");
                        address = scannerInput.next();
                        System.out.println("Enter your Phone_no : ");
                        phone_no = scannerInput.nextLong();
                        System.out.println("Your account number is : ");
                        account_no = 0;
                        Random random = new Random(account_no);
                        System.out.println(account_no);
                    } else
                        System.out.println("Enter your company name : ");
                    String company_name = scannerInput.next();
                    break;
                case 2:

                    System.out.println("Enter amount you want to Deposit : ");
                    float diposit_Amount = scannerInput.nextInt();
                    bankBalance = bankBalance + diposit_Amount;
                    System.out.println("Thank you for banking with us" + "\nDeposit  : " + diposit_Amount +
                            "\nTotal balance : " + bankBalance);
                    break;

                case 3:
                    System.out.println("Enter the amount you want to withdraw  : ");
                    float withdrawAmount = scannerInput.nextFloat();
                    try {
                        if (withdrawAmount > bankBalance) {
                            throw new InsufficientBalanceException();
                        } else
                            bankBalance = bankBalance - withdrawAmount;
                    } catch (InsufficientBalanceException e) {
                        e.printStackTrace();
                    }

                case 4:
                    System.out.println(" your account details are  : " +
                            "Name " + name +
                            "\nAddress " + address +
                            "\nPhone number " + phone_no +
                            "\nAccount Number " + account_no
                    );

            }
        }
    //}
}
    public  class MyBankPro {
        public static void main(String[] args) {
            MyBankOperations myBankOperations = new MyBankOperations();
            myBankOperations.menu_Input_From_User();
            myBankOperations.bank_operations();
        }
    }

