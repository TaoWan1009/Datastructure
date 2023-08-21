package exer01;

/**
 * ClassName: GeometricTest
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 16:25
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args){
        GeometricTest geo=new GeometricTest();
        MyRectangle rec=new MyRectangle("red",6.0,7.1,9.8);
        geo.displayArea(rec);
    }
    public boolean equalsArea(GeometricObject s,GeometricObject t){
        return s.findArea()==t.findArea();
    }
    public void displayArea(GeometricObject g){
        System.out.println("图形面积为："+g.findArea());
    }
}
