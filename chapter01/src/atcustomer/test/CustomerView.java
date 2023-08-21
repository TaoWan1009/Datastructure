package atcustomer.test;

/**
 * ClassName: CustomerView
 * Package: atcustomer.test
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/2 9:41
 * @Version 1.0
 */
public class CustomerView {
    CustomerList customerList=new CustomerList(10);
    public void enterMainMenu(){
        boolean isFlag=true;
        while(isFlag){
            System.out.println("\n------------拼电商客户系统-------------\n");
            System.out.println("\n------------1 添加客户");
            System.out.println("\n------------2 修改客户");
            System.out.println("\n------------3 删除客户");
            System.out.println("\n------------4 客户列表");
            System.out.println("\n----------请选择（1-5）");
            char key=CMUtility.readMenuSelection();
            switch(key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit=CMUtility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFlag = false;
                    }
                    break;
            }


        }
    }
    private void addNewCustomer(){

    }
    private void modifyCustomer(){

    }
    private void deleteCustomer(){

    }
    private void listAllCustomers(){

    }
    public static void main(String[] args){
        CustomerView view=new CustomerView();
        view.enterMainMenu();

    }

}
