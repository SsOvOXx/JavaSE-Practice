package com.ss;

import java.util.Random;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest07
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 19:04
 * @Version 1.0
 **/
public class StringTest07 {
    public static void main(String[] args) {
        // 1.定义长度为26，元素值为26个大写英文字母的数组chs
        char[] chs = new char[26];
        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char)('A' + i);
        }
        String result = getStr(chs);
        System.out.println(result);
    }


    public static String getStr(char[] chs) {
        Random r = new Random();
        //1个0-9之间（包含0和9）的整数
        String result = r.nextInt(10) + "";
        //随机的4个大写英文字母
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            result += chs[index];
        }
        return result;
    }
}