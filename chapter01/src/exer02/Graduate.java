package exer02;

/**
 * ClassName: Graduate
 * Package: exer02
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 16:51
 * @Version 1.0
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo(){
        return "Name:"+name+"\n"+"Age"+age+"Major"+major;
    }
}
