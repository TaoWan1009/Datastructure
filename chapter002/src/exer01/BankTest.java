package exer01;

/**
 * ClassName: BankTest
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 10:31
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);
        
    }
}
class Bank{
    private Bank(){

    }
    private static Bank instance=new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
