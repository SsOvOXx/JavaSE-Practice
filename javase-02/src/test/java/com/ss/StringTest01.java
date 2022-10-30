package com.ss;

import org.junit.Test;

import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest01
 * @description: 请用户输入一个“QQ号码”，我们来判断这个QQ号码是否正确。要求：使用方法来完成判断功能
 * @author: SsOvOXx
 * @create: 2022-09-20 19:03
 * @Version 1.0
 **/
public class StringTest01 {
    public static boolean checkQQ(String qq){
        //判定长度
        if(qq.length() < 6 || qq.length() > 12){
            return false;
        }

        //判定首数字
        //字符，0加引号
        if(qq.charAt(0) == '0'){
            return false;
        }

        //遍历判定是否为数字
        for (int i = 0; i < qq.length(); i++) {
            char ss = qq.charAt(i);
            if(ss >= '0' && ss <= '9'){
                return true;
            }else{
                return false;
            }
        }

        //全部通过
        return true;
    }

    //主方法测试
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的qq号码：");
        String num = scanner.nextLine();
        System.out.println(checkQQ(num) ? "您输入的qq号码是正确的！":"您输入了错误的qq号码！");
    }
}