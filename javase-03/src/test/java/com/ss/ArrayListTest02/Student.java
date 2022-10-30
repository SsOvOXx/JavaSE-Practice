package com.ss.ArrayListTest02;

/**
 * @program: JavaSE-Practice
 * @ClassName Student
 * @description:
 * 1.    定义Student类，包含以下属性：
 * 	学号、姓名、身高
 * 2.	定义MainApp类，包含main()方法；
 * 3.	在main()方法中，创建一个可以存储Student对象的集合对象；
 * 4.	创建以下几个Student对象z：
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
public class Student {
    private String stuId;
    private String stuName;
    private Double stuHeight;


    public Student(String stuId, String stuName, Double stuHeight) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuHeight = stuHeight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuHeight=" + stuHeight +
                '}';
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Double getStuHeight() {
        return stuHeight;
    }

    public void setStuHeight(Double stuHeight) {
        this.stuHeight = stuHeight;
    }
}