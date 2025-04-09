package S04WC;

public class BankAccount {
    private String holderName;
    private double balance;
    private int accountNumber;
    
    public BankAccount(String holderName, int accountNumber){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String holderName, int accountNumber, double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Holder: " + this.holderName;
        res += "\nAccount Number:" + this.accountNumber;
        res += "\nBalance: " + this.balance;
        return res;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
    
    public void deposit(double amount){
        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bobby", 35620643);
        account.deposit(753.25);
        account.withdraw(395);
    }
    
}
