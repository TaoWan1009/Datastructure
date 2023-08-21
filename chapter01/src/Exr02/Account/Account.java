package Exr02.Account;

/**
 * ClassName: Account
 * Package: Exr02.Account
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/6 15:06
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
