public class Checking extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public Checking(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
            mBalance -= amount;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+
                "mBalance=" + mBalance +
                '}';
    }
}