/**
 * ClassName: MyArray
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/26 12:10
 * @Version 1.0
 */
public class MyArray {
    /**
     * 获取int[]的最大值
     * @param arr
     * @return
     */
    public int getMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print(","+arr[i]);
            }
        }
        System.out.print("]");
    }


}
