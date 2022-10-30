package com.ss;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayTest07
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 10:18
 * @Version 1.0
 **/
public class ArrayTest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入组数
        System.out.println("请输入组数");
        int groupNum = sc.nextInt();
        //录入每组学生人数
        System.out.println("请输入每组学生人数");
        int stuNum = sc.nextInt();
        //定义二维数组
        int[][] arr = new int[groupNum][stuNum];
        //总不及格人数
        int totalNotPass = 0;
        //班级的总分数
        int totalScore = 0;
        Random r = new Random();
        //定义变量，用来作为最大的平均分
        double maxAvgScore = 0.0;
        for(int i = 0; i < arr.length; i++) {//arr[1]
            //定义每组不及格人数
            int groupNotPass = 0;
            //定义每组的总分数
            int groupScore = 0;
            //二维数组中的每个一维数组怎么表示  arr[i]
            for(int j = 0; j < arr[i].length; j++) {
                //生成随机的成绩，赋值给数组的每一个元素
                int score = r.nextInt(101);
                arr[i][j] = score;
//				对这个成绩进行一个判断，如果这个成绩小于60，就把不及格人数+1
                if(score < 60) {
                    totalNotPass++;
                    //把每组的不及格人数+1
                    groupNotPass++;
                }
                totalScore += score;
                groupScore += score;
            }
            System.out.println("第"+ (i + 1) +"组不及格人数为: "+groupNotPass+" 人");
            //计算平均分
            double avgGroupScore = groupScore / (arr[i].length + 0.0);
            //如果其他组的平均分比他大，就把当前最大的平均分赋值给这个maxAvgScore
            if(avgGroupScore > maxAvgScore) {
                maxAvgScore = avgGroupScore;
            }
            System.out.println("第"+ (i + 1) +"组平均分为: " + avgGroupScore);
        }
        System.out.println("不及格人数是"+totalNotPass);
        //平均分
        double avgScore = totalScore / (groupNum * stuNum + 0.0);
        System.out.println("平均分是："+avgScore);
        System.out.println("单组最高的平均分是"+maxAvgScore);
    }
}