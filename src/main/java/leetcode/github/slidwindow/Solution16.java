package leetcode.github.slidwindow;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * q16_最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 *
 *  
 *
 * 示例：
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *  
 *
 * 提示：
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 * 通过次数195,896提交次数426,731
 * 在真实的面试中遇到过这道题？
 *
 */
public class Solution16 {

    /**
     * 排序后从第一个数开始往后找两个数 双指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++){
            int start =i+1,end =nums.length-1;
            while(start <end){
                int sum = nums[start] +nums[end]+nums[i];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=sum;
                }
                if(sum>target){
                    end--;
                }
                else if(sum<target){
                    start++;
                }
                else{
                    return ans;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("-------------开始执行-------------");
        Assert.isTrue(threeSumClosest(new int[]{-1,2,1,-4},1)==2,"程序异常");
        System.out.println("-------------运行通过-------------");
    }
}
