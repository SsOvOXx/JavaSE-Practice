package com.ss.Level01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest05
 * @description: Map遍历
 * @author: SsOvOXx
 * @create: 2022-09-22 19:07
 * @Version 1.0
 **/
public class MapTest05 {
    public static void main(String[] args) {
        //创建
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //添加元素
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("吴亦凡", "李易峰");
        hashMap.put("武大郎", "潘金莲");
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            //key值需要给定变量，未规定数据值
            String key = iterator.next();
            String value = hashMap.get(key);
            System.out.println("key:" + key + ",value:" + value);
        }
    }
}