package at.tim.basics.Bank;

public class LändleGirokonto extends Girokonto {
    private double balance;
    private int interest;
    private int withdrawalmoney;
    private int depositmoney;

    public LändleGirokonto(int balance, int interest) {
        super(balance, interest);
    }

    public void withdraw() {
        if (this.balance - this.withdrawalmoney >= 0-this.balance*3) {
            this.balance -= this.withdrawalmoney;
        } else System.out.println("Nicht genug Geld am Konto");
    }

    public void interest() {
        this.balance = this.balance + this.balance * 5 / 100;
    }

    public void deposit() {
        this.balance = +this.depositmoney;
    }

    public void balance() {
        System.out.println("Der Kontostand ist: " + this.balance);
    }

    public double getBalance() {return balance;}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getWithdrawalmoney() {
        return withdrawalmoney;
    }

    public void setWithdrawalmoney(int withdrawalmoney) {
        this.withdrawalmoney = withdrawalmoney;
    }
}
