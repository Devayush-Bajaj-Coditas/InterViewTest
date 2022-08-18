public class AccountNotFoundException extends Exception{
    AccountNotFoundException(){
        super("Account not found in database");
    }

}
