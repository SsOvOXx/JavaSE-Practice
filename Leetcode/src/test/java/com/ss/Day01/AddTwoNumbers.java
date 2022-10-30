package com.ss.Day01;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: JavaSE-Practice
 * @ClassName AddTwoNumbers
 * @description:
 * @author: SsOvOXx
 * @create: 2022-10-06 21:03
 * @Version 1.0
 **/
public class AddTwoNumbers {
    @Test
    public void addTwoNumbers(){
        int[] arr1 = {2,4,3,4,6};
        int[] arr2 = {5,6,4,4,3};
        int arr11 = 0;
        int arr22 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr11 += Math.pow(10, i) * arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr22 += Math.pow(10, j) * arr2[j];
        }
        int res1,res2;
        res1 = res2 = arr11 + arr22;
        int count = 0;
        while (res1 > 0){
            res1 = res1 / 10;
            count++;
        }
        int[] arr3 = new int[count];
        // res2 = 807
        // count = 3
        while(count > 0) {
            count--;
            arr3[count] = res2 / (int) Math.pow(10, count);
            res2 = res2 % (int) Math.pow(10, count);
        }

        System.out.println(Arrays.toString(arr3));
    }
}