package com.ss.ArrayListTest01;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayListTest01
 * @description:
 * 1.    定义一个只能存储字符串的集合对象；
 * 2.	向集合内添加以下数据：
 * 	“孙悟空”
 * 	“猪八戒”
 * 	“沙和尚”
 * 	“铁扇公主”
 * 3.	不用遍历，直接打印集合；
 * 4.	获取第4个元素（注意，是--第4个元素，它的索引是？）
 * 5.	打印一下集合大小；
 * 6.	删除元素“铁扇公主”
 * 7.	删除第3个元素（注意：是--第3个元素）
 * 8.	将元素“猪八戒”改为“猪悟能”
 * 9.	再次打印集合；
 *
 * @author: SsOvOXx
 * @create: 2022-09-21 19:08
 * @Version 1.0
 **/
public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("孙悟空");
        arrayList.add("猪八戒");
        arrayList.add("沙和尚");
        arrayList.add("铁扇公主");

        System.out.println("下面打印集合");
        System.out.println(arrayList.toString());
        System.out.println("----------------------");

        System.out.println("获取第4个元素");
        System.out.println(arrayList.get(3));
        System.out.println("----------------------");

        System.out.println("打印集合大小");
        System.out.println(arrayList.size());
        System.out.println("----------------------");

        System.out.println("删除元素铁扇公主");
        arrayList.remove(3);
        System.out.println("----------------------");

        System.out.println("删除第3个元素");
        arrayList.remove(2);
        System.out.println("----------------------");

        System.out.println("将猪八戒改为猪悟能");
        arrayList.set(1, "猪悟能");
        System.out.println("----------------------");

        System.out.println("下面再次打印集合");
        System.out.println(arrayList.toString());
        System.out.println("----------------------");
    }
}