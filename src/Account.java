
import java.util.Date;

public class Account {

    protected String mName;
    protected int mId;
    protected double mBalance;
    protected Date mDateCreated;

    public Account() {
        mDateCreated = new Date();

    }

    public Account(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        mName = name;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public void withdraw(double amount) {
        if(mBalance<amount){
            System.out.println("The draw is forbidden");
            return;
        }
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mBalance += amount;
    }

    @Override
    public String toString() {
        return "Account name: " + mName + "\n" ;
    }

}