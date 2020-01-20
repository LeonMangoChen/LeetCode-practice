package pig.november.weekfive;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @Author     ：maochang.jiang
 * @Date       ：Created in 2019-11-28 20:28
 * @description：TwoSum
 */
public class TwoSum_Thursday {
    //笨方法，双重for循环
    public static void main(String[] args) {
//        int[] nums = {2,11,15,7};
//        int target = 9;
//
//        System.out.println(twoSum_two(nums,target));
        Integer a1 = 127;
        Integer a2 = 127;
        System.out.println(a1 == a2);
    }

    //笨方法：双重for循环
    private static String twoSum_one(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return i + "--" + j;
                }
            }
        }
        return "无";
    }

    //先把
    private static String twoSum_two(int[] nums,int target){
        Map<Integer,Integer> intMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            intMap.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println("j==>"+j+"   nums[]==>"+nums[j]);
            if (intMap.containsKey(target-intMap.get(nums[j]))){
                System.out.println("===="+(target-intMap.get(nums[j])));
                return intMap.get(j) + "--"+ intMap.get(target-intMap.get(nums[j]));
            }
        }
        return null;
    }

}
