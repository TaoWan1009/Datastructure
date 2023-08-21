/**
 * ClassName: Exer01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/26 11:44
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args){
        Exer01 exer=new Exer01();
        //exer.method1();
        int area=exer.method3(4,5);
        System.out.println("面积为:"+area);


    }
    public void method1(){
        for(int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int method3(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }


}
