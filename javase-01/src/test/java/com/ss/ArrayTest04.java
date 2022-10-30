package com.ss;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @program: JavaSE-Practice
 * @ClassName ArrayTest04
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-19 19:56
 * @Version 1.0
 **/
public class ArrayTest04 {
    @Test
    public void  ArrayTest04(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int count = scanner.nextInt();
        int[] array = new int[count];
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
        }
        System.out.println("数组为：");
        for (int x : array
             ) {
            System.out.println(x);
        }
        System.out.println("结果数组为");
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 5 && array[j]%2 == 0){
                System.out.println(array[j]);
            }
        }

    }
}