package com.ss.ArrayListTest02;

import java.util.ArrayList;

/**
 * @program: JavaSE-Practice
 * @ClassName ArrayListTest02
 * @description:
 * 1.    定义Student类，包含以下属性：
 * 	学号、姓名、身高
 * 2.	定义MainApp类，包含main()方法；
 * 3.	在main()方法中，创建一个可以存储Student对象的集合对象；
 * 4.	创建以下几个Student对象：
 * 	学号		姓名		身高	
 * 	it001	黄渤		1.72
 * 	it002	孙红雷	1.78
 * 	it003	章子怡	1.64
 * 	it004	杨颖		1.68
 * 5.	将上面几个对象添加到集合中
 * 6.	遍历集合打印每个对象的属性值；
 * 7.	获取并打印集合大小；
 * 8.	获取第3个学员对象，并打印其属性值；
 * 9.	移除掉第4个学员对象；
 * 10.	再次获取并打印集合大小；
 * 11.	将第一个对象替换为以下对象：
 * 	it005	撒贝宁	1.67
 * 12.	遍历集合，打印出身高在1.70以上的学员信息；
 * 13.	遍历集合，打印出“孙”姓的学员信息；
 * @author: SsOvOXx
 * @create: 2022-09-21 19:40
 * @Version 1.0
 **/
public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建对象
        Student stu01 = new Student("it001","黄渤",1.72);
        Student stu02 = new Student("it002","孙红雷",1.78);
        Student stu03 = new Student("it003","章子怡",1.64);
        Student stu04 = new Student("it004","杨颖",1.68);
        //创建集合，泛型
        ArrayList<Student> arrayList = new ArrayList<Student>();
        //添加数据
        arrayList.add(0 , stu01);
        arrayList.add(1 , stu02);
        arrayList.add(2 , stu03);
        arrayList.add(3 , stu04);
        //循环查询每个对象的属性
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("第" + (i+1) + "个对象的属性");
            System.out.println("学号:" + arrayList.get(i).getStuId());
            System.out.println("姓名:" + arrayList.get(i).getStuName());
            System.out.println("身高:" + arrayList.get(i).getStuHeight());
            System.out.println("-------------------");
        }
        //获取并打印集合大小
        System.out.println("集合大小为：" + arrayList.size());
        //获取第三个学员对象，并打印其属性
        System.out.println("第三个学员的学号:" + arrayList.get(2).getStuId());
        System.out.println("第三个学员的姓名:" + arrayList.get(2).getStuName());
        System.out.println("第三个学员的身高:" + arrayList.get(2).getStuHeight());
        //移除第4个学员对象
        arrayList.remove(3);
        //再次获取并打印集合大小
        System.out.println("更改后的集合大小为：" + arrayList.size());
        //将第一个对象替换为以下对象：it005	撒贝宁	1.67
        arrayList.get(0).setStuHeight(1.67);
        arrayList.get(0).setStuId("it005");
        arrayList.get(0).setStuName("撒贝宁");
        //遍历集合，打印出身高在1.70以上的学员信息
        arrayList.forEach(arr -> System.out.println(
                arr.getStuHeight() > 1.70 ?
                        "身高在1.70以上的人的学号：" + arr.getStuId() +
                                ",姓名为：" + arr.getStuName() +
                                ",身高为:" + arr.getStuHeight()
                        : ""
        ));
        //遍历集合，打印出“孙”姓的学员信息；
        arrayList.forEach(arr -> System.out.println(
                arr.getStuName().startsWith("孙") ?
                        "'孙'姓的学员人的学号：" + arr.getStuId() +
                                ",姓名为：" + arr.getStuName() +
                                ",身高为:" + arr.getStuHeight()
                        : ""
        ));
    }
}