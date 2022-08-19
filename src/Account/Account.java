package Account;

public class Account {
    String name,address, emailID;
    long phoneNumber;
    long accountNumber;

    public Account(String name, String address, String emailID, long phoneNumber, long accountNumber) {
        this.name = name;
        this.address = address;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }
}



class SavingsAccount extends  Account{

    public SavingsAccount(String name, String address, String emailID, long phoneNumber, long accountNumber) {
        super(name, address, emailID, phoneNumber, accountNumber);
    }
}

class CurrentAccount extends Account{
    String companyNAme;
    public CurrentAccount(String name, String address, String emailID, long phoneNumber, long accountNumber,String companyName) {
        super(name, address, emailID, phoneNumber, accountNumber);
        this.companyNAme = companyNAme;
    }
}

