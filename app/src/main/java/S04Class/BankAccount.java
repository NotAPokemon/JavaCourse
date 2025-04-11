package S04Class;
// Arvan Kadkol
// 4/10/25

import Utils.StringUtils;

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

    public BankAccount(){

    }

    @Override
    public String toString() {
        String res = "";
        res += "Holder: " + getHolderName();
        res += "\nAccount Number: " + getAccountNumber();
        res += "\nBalance: $" + StringUtils.toCommaString(getBalance());
        return res + "\n";
    }

    public void withdraw(double amount){
        if (this.balance < amount){
            System.out.println("Unsuccsesful Transaction: Insufficent funds");
            return;
        }
        this.balance -= amount;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bobby", 35620643);
        account1.deposit(753.25);
        account1.withdraw(395);
        BankAccount account2 = new BankAccount();
        account2.setAccountNumber(9496389);
        account2.setBalance(89932.64);
        account2.setHolderName("Bob");
        System.out.println(account2);
        System.out.println(account1);

        account1.withdraw(999999);
    }
    
}

