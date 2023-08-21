package atcustomer.test;

/**
 * ClassName: CustomerList
 * Package: atcustomer.test
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/2 9:03
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total;//记录客户数量
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total<customers.length){
            customers[total++]=customer;
            return true;
        }else{
            return false;
        }
    }
    public boolean replaceCustomer(int index, Customer cust){
        if(index>=0 && index<total){
            customers[index]=cust;
            return true;
        }
        return false;
    }
    public boolean deleteCustomer(int index){
       if(index<0 || index>=total){
           return false;
       }
       for(int i=index;i<total-1;i++){
           customers[i]=customers[i+1];
       }
       customers[total-1]=null;
       total--;
       return true;
    }
    public Customer[] getCustomers(){
        Customer[] cust=new Customer[total];
        for(int i=0;i<total;i++){
            cust[i]=customers[i];
        }
        return cust;
    }
    public Customer getCustomer(int index){
        if(index<0 || index>=total){
            return null;
        }
        return customers[index];
    }
    public int getTotal(){
        return total;
    }
}
