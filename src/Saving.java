public class Saving extends Account {

    protected double OVERDRAFT_LIMIT = 0;

    public Saving(int id, double balance) {
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
        return "SavingsAccount{" +
                "mBalance=" + mBalance +
                '}';
    }
}