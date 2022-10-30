package com.ss.Level01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest03
 * @description: Map接口中的方法
 * @author: SsOvOXx
 * @create: 2022-09-22 18:47
 * @Version 1.0
 **/
public class MapTest03 {
    public static void main(String[] args) {
        //创建
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //输值
        hashMap.put("001", "杜兰特");
        hashMap.put("002", "威少");
        hashMap.put("003", "哈登");
        hashMap.put("004", "字母哥");
        //获取所有的key
        Set<String> keySet = hashMap.keySet();
        //增强for循环遍历
        System.out.println("增强for循环遍历:");
        for(String keys : keySet){
            System.out.println(keys);
        }
        //获取迭代器
        Iterator<String> iterator = keySet.iterator();
        //迭代器遍历
        System.out.println("迭代器遍历:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}