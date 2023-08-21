/**
 * ClassName: testStudent
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/26 17:51
 * @Version 1.0
 */
public class testStudent {
    public static void main(String[] args){
        Student[] students=new Student[20];
        for(int i=0;i<students.length;i++){
            students[i]=new Student();
            students[i].number=i+1;
            students[i].state=(int)(Math.random()*6+1);
            students[i].score=(int)(Math.random()*101);
        }
    }
}
