package com.ss.Level01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest04
 * @description: Map接口中的方法
 * @author: SsOvOXx
 * @create: 2022-09-22 18:58
 * @Version 1.0
 **/
public class MapTest04 {
    public static void main(String[] args) {
        //创建
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //添加元素
        hashMap.put("001", "德布劳内");
        hashMap.put("002", "哈兰德");
        hashMap.put("003", "德赫亚");
        hashMap.put("004", "马奎尔");
        //获取所有的value
        Collection<String> values = hashMap.values();
        //获取每个value
        System.out.println("获取每个value:");
        for(String value : values){
            System.out.println(value);
        }
        //迭代器获取每个value
        System.out.println("迭代器获取:");
        Iterator<String> it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}