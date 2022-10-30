package com.ss.Level01.MapTest07;

/**
 * @program: JavaSE-Practice
 * @ClassName Student
 * @description: 学生类
 * @author: SsOvOXx
 * @create: 2022-09-22 19:27
 * @Version 1.0
 **/
public class Student {
    private String stuName;
    private int stuAge;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public Student() {
    }
}