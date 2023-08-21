/**
 * ClassName: testMyArray
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/26 17:04
 * @Version 1.0
 */
public class testMyArray {
    public static void main(String[] args){
        MyArray arrs=new MyArray();
        int[] arr=new int[]{23,43,12,42,11,9999};
        arrs.print(arr);
        arrs.bubbleSort(arr);
        arrs.print(arr);

    }
}
