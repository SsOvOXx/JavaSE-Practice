package com.ss;

import java.util.Random;

/**
 *
 * @program: JavaSE-Practice
 * @ClassName ArrayTest05
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-19 19:56
 * @Version 1.0
 **/
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
        int[] newArr = new int[3];
        for (int i = 0; i < newArr.length; i++) {
            Random r = new Random();

            int index = r.nextInt(arr.length);
            newArr[i] = arr[index];
        }
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
            sum += newArr[i];
        }
        System.out.println("sum =" + sum);
    }
}