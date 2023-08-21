/**
 * ClassName: wt
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/7/14 17:23
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;


public class wt{
    public static void main(String[] args){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,2);
        for(Integer i : map.keySet()){
            System.out.println("key:"+i+"value:"+map.get(i));
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}



