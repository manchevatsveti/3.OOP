package eddu.smg;

public class CheckingAccount extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

   
    public String toString() {
        return "CheckingAccount{"+
                "Balance=" + getBalance() +
                '}';
    }
}

