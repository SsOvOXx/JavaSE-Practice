package com.ss;

import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest04
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 19:03
 * @Version 1.0
 **/
public class StringTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入大字符串:");
        String big = sc.nextLine();
        System.out.print("请输入小字符串:");
        String small = sc.nextLine();
        int count = getCount(big, small);
        System.out.println("小字符串"+ small +",在大字符串"+ big +"中共出现"+ count +"次");
    }


    public static int getCount(String big, String small) {
        int index = 0;
        int count = 0;
        while((index = big.indexOf(small, index)) != -1){
            index++;
            count++;
        }
        return count;
    }
}