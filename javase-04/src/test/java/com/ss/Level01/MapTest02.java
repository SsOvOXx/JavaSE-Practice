package com.ss.Level01;

import java.util.HashMap;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest02
 * @description: Map接口中的常用方法
 * 1.创建HashMap
 * 2.使用put添加元素
 * 3.使用put修改元素
 * 4使用get获取元素
 * 5.使用remove删除元素
 * 6.打印集合中的元素
 * @author: SsOvOXx
 * @create: 2022-09-22 18:39
 * @Version 1.0
 **/
public class MapTest02 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //添加
        hashMap.put("001", "蔡徐坤");
        hashMap.put("002", "苟安");
        hashMap.put("003", "曹真");
        //修改
        hashMap.put("003","姜维");
        //获取
        String name = hashMap.get("003");
        System.out.println(name);
        //删除
        hashMap.remove("001");
        //打印
        System.out.println(hashMap.toString());
    }
}