package exer01;

/**
 * ClassName: CircleTest
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 9:46
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle cr=new Circle();
        Circle cr1=new Circle();
        Circle cr2=new Circle(22);
        System.out.println(cr);
        System.out.println(cr1);
        System.out.println(Circle.total);
        System.out.println(cr2);
    }
}
