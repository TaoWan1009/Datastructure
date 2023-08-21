package exer01;

/**
 * ClassName: AccountTest
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 10:04
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc=new Account();
        Account acc1=new Account();
        Account acc2=new Account("123",44);
        System.out.println(acc);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
