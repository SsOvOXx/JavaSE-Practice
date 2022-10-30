package com.ss.ArrayListTest05;

/**
 * @program: JavaSE-Practice
 * @ClassName Student
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-21 20:51
 * @Version 1.0
 **/
public class Student {
    private String name;
    private int age;
    private int score;
    public Student() {
        super();
    }
    public Student(String name, int age, int score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}