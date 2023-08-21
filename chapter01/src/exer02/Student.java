package exer02;

/**
 * ClassName: Student
 * Package: exer02
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 16:49
 * @Version 1.0
 */
public class Student extends person{
    protected String school="pku";
    public String getInfo(){
        return "Name:"+name+"\n"+"Age"+age+"School:"+school;
    }
}
