package com.ss.ArrayListTest03;

/**
 * @program: JavaSE-Practice
 * @ClassName Student
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-21 20:23
 * @Version 1.0
 **/
public class Student {
    private String id;//学号
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄
    private double height;//身高
    public Student() {
        super();
    }
    public Student(String id, String name, String sex, int age, double height) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}