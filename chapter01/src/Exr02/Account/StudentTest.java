package Exr02.Account;

/**
 * ClassName: StudentTest
 * Package: Exr02.Account
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/6 10:39
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        student stu1 = new student("wantao", 22);
        student stu2 = new student("wantao", 22);
        System.out.println(stu1.equals(stu2));
        String s1 = new String("ww");
        String s2 = new String("ww");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        Integer i = 12;
        Integer h = 127;
        System.out.println(i.equals(h));
        System.out.println(i == h);

    }
}

class student{
    String name;
    int age;



    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof student) {
//            student stu = (student) obj;
//            return this.age == stu.age && this.name.equals(((student) obj).name);
//        } else {
//            return false;
//        }
//    }
}


