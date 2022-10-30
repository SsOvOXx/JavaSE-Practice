package com.ss.Day01;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaSE-Practice
 * @ClassName TwoSum
 * @description:
 * @author: SsOvOXx
 * @create: 2022-10-06 18:47
 * @Version 1.0
 **/
public class TwoSum {
    /**
     * time:2ms
     * memory:41.3MB
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    @Test
    public void twoSum(){
        int[] nums = {2,7,11,15};
        int target = 18;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * time:1ms
     * memory:41.4MB
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumPlus(int[] nums, int target) {
        int j = nums.length - 1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                int res1[] = {map.get(target-nums[i]),i};
                Arrays.sort(res1);
                return res1;
            }
            map.put(nums[i],i);
            if(map.containsKey(target-nums[j])){
                int res2[] = {map.get(target-nums[j]),j};
                Arrays.sort(res2);
                return res2;
            }
            map.put(nums[j],j);
            j--;
        }
        return null;
    }
    @Test
    public void twoSumPlus(){
        int[] nums = {2,7,11,15,77,3,5};
        int target = 14;
        int[] ints = twoSumPlus(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}