package exer01;

/**
 * ClassName: Circle
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 9:43
 * @Version 1.0
 */

public class Circle {
    private double radius;
    private int id;
    static int total;
    public Circle(){
        this.id=init;
        init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius=radius;
    }
    private static int init=1001;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
