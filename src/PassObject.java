/**
 * ClassName: PassObject
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/30 12:09
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args){
        PassObject obj=new PassObject();
        Circle circle=new Circle();
        obj.printArea(circle,5);
    }
    public void printArea(Circle c, int time){
        System.out.print("Radius\t\tArea");
        for(int i=0;i<time;i++){
            c.radius=i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
    }
}
