package at.tim.basics.Bank;

public class Main {
    public static void main(String[] args) {
        Girokonto g1 = new Girokonto(10000,5);
        g1.interest();
        g1.setWithdrawalmoney(100);
        g1.withdraw();
        g1.balance();
    }
}
