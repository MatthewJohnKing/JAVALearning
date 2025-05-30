package Course3;

public class BankAccount {
    //Test in encapsulation.
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance,0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Withdrawing full balance:" + getBalance());
            amount=getBalance();
            }
        setBalance(getBalance()-amount);

    }

    public void deposit(double amount){
        if(amount>0) {
            setBalance(getBalance() + amount);
        }
    }

}
