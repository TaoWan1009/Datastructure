import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DataStructure01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/26 10:19
 * @Version 1.0
 */
public class DataStructure01 {
    public static void main(String[] args){
        List list=new ArrayList<>();
        list.add("avz");
        list.add("123");
        for(int i=0;i<list.size();i++){
            String name=(String)list.get(i);
            System.out.println(name);
        }
    }

}
