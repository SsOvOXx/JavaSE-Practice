package com.ss;

import org.junit.Test;

import java.util.Random;

/**
 * 遍历随机0-9的随机一维数组
 * @program: JavaSE-Practice
 * @ClassName ArrayTest02
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-19 19:56
 * @Version 1.0
 **/
public class ArrayTest02 {
    @Test
    public void ArrayTest02(){
        Random random = new Random();
        int[] array02 = new int[3];
        int min =11;
        for (int i = 0; i < array02.length; i++) {
            array02[i] = random.nextInt(10);
            System.out.println("数组的第" + (i+1) + "个值为" + array02[i]);
            if (array02[i] < min){
                min = array02[i];
            }
        }
        System.out.println("最小的值为" + min);
    }
}