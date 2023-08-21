package exer02;

/**
 * ClassName: InstanceTest
 * Package: exer02
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 16:53
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args){
        InstanceTest ins=new InstanceTest();
        ins.method(new Student());
    }
    public void method(person p){
        System.out.println(p.getInfo());
        if(p instanceof Graduate){
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        }else if(p instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        }else{
            System.out.println("a person");
        }
    }
}
