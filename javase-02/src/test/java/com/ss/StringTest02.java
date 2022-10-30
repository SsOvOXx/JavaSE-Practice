package com.ss;

import org.junit.Test;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest02
 * @description: 定义字符进行判断
 * @author: SsOvOXx
 * @create: 2022-09-20 19:03
 * @Version 1.0
 **/
public class StringTest02 {
        int count1 = 0;
        int count2 = 0;
        String str = new String("javajfiewjavajfiowfjavagkljjava");

    @Test
    public void strTest01(){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'j'){
                count1++;
            }
        }
        System.out.println("字符j的数量为" + count1 + "个！");
    }

    @Test
    public void strTest02(){
        for (int j = 0; j < (str.length() - 3); j++) {
            if(     str.charAt(j) == 'j' &&
                    str.charAt(j+1) == 'a' &&
                    str.charAt(j+2) == 'v' &&
                    str.charAt(j+3) == 'a')
            {
                count2++;
            }
        }
        System.out.println("单词java的数量为" + count2 + "个！");
    }
}