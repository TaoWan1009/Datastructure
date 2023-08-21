package exer01;

/**
 * ClassName: Circle
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 16:17
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
