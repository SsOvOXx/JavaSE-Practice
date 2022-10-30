package com.ss.ArrayListTest07;

import java.util.ArrayList;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayListTest07
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-21 20:55
 * @Version 1.0
 **/
public class ArrayListTest07 {
    public static void reverse(ArrayList<Integer> list){
        for (int i = 0, j=list.size()-1; i < j; i++,j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    /*
     *	2.public static Integer max(ArrayList<Integer> list);
        参数ArrayList<Integer> list:要进行操作的集合对象
        要求：求出list集合对象中的最大值并返回
     */
    public static Integer max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    /*
     * 	3.public static int indexOf(ArrayList<Integer> list,Integer i);
        参数ArrayList<Integer> list:要进行操作的集合对象
        参数Integer i:需要在集合中查找的元素
        要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
     */
    public static int indexOf(ArrayList<Integer> list,Integer i){
        int index = -1;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == i) {
                index = j;
                break;
            }
        }
        return index;
    }

    /*
     * 4.public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
            参数ArrayList<Integer> list:要进行操作的集合对象
            参数Integer oldValue:需要被替换掉的原值
            参数Integer newValue：替换后的新值
            要求：将list集合中的所有值为oldValue的元素替换为newValue
     */
    public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);
            }
        }
    }
}