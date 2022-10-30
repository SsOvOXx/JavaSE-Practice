package com.ss;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayTest06
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 10:18
 * @Version 1.0
 **/
public class ArrayTest06 {
    public static void main(String[] args) {
        int notPassCount = 0;

        int totalScore = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数");
        int stuNum = sc.nextInt();

        int[] arr = new int[stuNum];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {

            int score = r.nextInt(101);

            arr[i] = score;

            if(score < 60) {
                notPassCount++;
            }

            totalScore += score;
        }

        double avgScore = totalScore / (stuNum + 0.0);
        System.out.println("不及格人数是"+notPassCount);
        System.out.println("班级平均分:" + avgScore);
    }
}