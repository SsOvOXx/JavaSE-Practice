package com.ss.Level01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest06
 * @description: Map遍历
 * @author: SsOvOXx
 * @create: 2022-09-22 19:20
 * @Version 1.0
 **/
public class MapTest06 {
    public static void main(String[] args) {
        //创建
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //添加元素
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("吴亦凡", "李易峰");
        hashMap.put("武大郎", "潘金莲");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entries.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, String> entrys = entryIterator.next();
            System.out.println("key:"+ entrys.getKey() + "value:" + entrys.getValue());
        }
    }
}