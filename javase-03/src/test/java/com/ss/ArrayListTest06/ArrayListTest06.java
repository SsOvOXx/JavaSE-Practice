package com.ss.ArrayListTest06;

import java.util.ArrayList;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayListTest06
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-21 20:54
 * @Version 1.0
 **/
public class ArrayListTest06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ab1");
        list.add("123ad");
        list.add("bca");
        list.add("dadfadf");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦");
        list.add("别跑啊");
        //遍历集合，拿到每一个字符串
        for(int i = 0; i < list.size(); i++) {
            //拿到每一个字符串
            String str = list.get(i);
            //判断字符串长度是否大于5
            if(str.length() > 5) {
                //如果大于5，就删除
                list.remove(i);
                i--;
            }
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}