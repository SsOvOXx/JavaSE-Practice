package com.ss;

import org.junit.Test;

/**
 * 数组求最小值
 * @program: JavaSE-Practice
 * @ClassName ArrayTest01
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-19 19:42
 * @Version 1.0
 **/
public class ArrayTest01 {
    @Test
    public void ArrayTest01(){
        int min = 100;
        int[] array = {5,2,3,8,14};
        for (int i = 0; i < 5; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小的值为" + min);
    }
}