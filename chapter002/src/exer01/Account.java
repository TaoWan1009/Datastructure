package exer01;

/**
 * ClassName: Account
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 9:59
 * @Version 1.0
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static double interestRate;
    private static double minBalance;

    public Account() {
        this.id=init;
        init++;
        password="0000";
    }
    private static int init=1001;

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
