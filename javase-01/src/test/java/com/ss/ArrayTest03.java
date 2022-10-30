package com.ss;

import org.junit.Test;

/**
 * 对应元素双倍值的数组
 * @program: JavaSE-Practice
 * @ClassName ArrayTest03
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-19 19:56
 * @Version 1.0
 **/
public class ArrayTest03 {
    @Test
    public void ArrayTest03(){
        int[] nums = {5,10,15};
        int[] array = new int[3];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i] * 2;
        }
        System.out.println("新的数组为["+ array[0]+ "," + array[1] + "," + array[2] + "]");
    }
}