package com.ss;

import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest05
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 19:04
 * @Version 1.0
 **/
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入源字符串:");
        String srcStr = sc.nextLine();
        System.out.print("请输入要删除的字符串:");
        String delStr = sc.nextLine();
        printCount(srcStr, delStr);

    }

    private static void printCount(String srcStr, String delStr) {
        String resultStr = srcStr.replace(delStr, "");
        int count = (srcStr.length() - resultStr.length()) / delStr.length();
        System.out.println("源字符串中总共包含:"+ count +" 个 "+ delStr +" ,删除"+ delStr +"后的字符串为: "+ resultStr);
    }
}