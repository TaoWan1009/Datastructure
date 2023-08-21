package Exr02.Account;

/**
 * ClassName: CustomerTest
 * Package: Exr02.Account
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/6 15:10
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust=new Customer("wantao",12,new Account(2000));
        Customer cust1=new Customer("wantao",12,new Account(2000));
        System.out.println(cust.equals(cust1));
    }
}
